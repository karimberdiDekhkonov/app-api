package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapi.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

    boolean existsByHomeNumberAndStreet(String homeNumber,String street);
}
