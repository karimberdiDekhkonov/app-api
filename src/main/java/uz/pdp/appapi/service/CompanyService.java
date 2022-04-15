package uz.pdp.appapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appapi.entity.Address;
import uz.pdp.appapi.entity.Company;
import uz.pdp.appapi.payload.CompanyDto;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.repository.AddressRepository;
import uz.pdp.appapi.repository.CompanyRepository;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CompanyRepository companyRepository;

    public Page<Company> getCompanies(int page){
        Pageable pageable = PageRequest.of(page,10);
        return companyRepository.findAll(pageable);
    }

    public Company getCompany(Integer id){
        Optional<Company> optional = companyRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return new Company();
    }

    public Result addCompany(CompanyDto dto){
        Optional<Address> optional = addressRepository.findById(dto.getAddressId());
        if (!optional.isPresent()){
            return new Result("Id is not found",false);
        }
        Company company = new Company();
        company.setAddress(optional.get());
        company.setCorpName(dto.getCorpName());
        company.setDirectorName(dto.getDirectorName());
        companyRepository.save(company);
        return new Result("Added",true);
    }
}
