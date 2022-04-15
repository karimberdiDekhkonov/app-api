package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapi.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
