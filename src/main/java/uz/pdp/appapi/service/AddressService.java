package uz.pdp.appapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appapi.entity.Address;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.repository.AddressRepository;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;


    public Page<Address> getAddresses(int page){
        Pageable pageable = PageRequest.of(page,10);
        return addressRepository.findAll(pageable);
    }

    public Address getAddress(Integer id){
        Optional<Address> optional = addressRepository.findById(id);

        if (optional.isPresent()){
            return optional.get();
        }
        return new Address();
    }

    public Result addAddress(Address address){
        boolean exists = addressRepository.existsByHomeNumberAndStreet(address.getHomeNumber(), address.getStreet());
        if (exists){
            return new Result("This address is already exist !",false);
        }
        Address adding = new Address();
        adding.setHomeNumber(adding.getHomeNumber());
        adding.setStreet(address.getStreet());
        addressRepository.save(adding);
        return new Result("Successfully added !",true);
    }
}
