package uz.pdp.appapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appapi.entity.Company;
import uz.pdp.appapi.entity.Department;
import uz.pdp.appapi.payload.DepartmentDto;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.repository.CompanyRepository;
import uz.pdp.appapi.repository.DepartmentRepository;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    public Page<Department> getDepartments(int page){
        Pageable pageable = PageRequest.of(page,10);
        return departmentRepository.findAll(pageable);
    }

    public Department getDepartment(Integer id){
        Optional<Department> optional = departmentRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return new Department();
    }

    public Result addDepartment(DepartmentDto dto){
        Optional<Company> optional = companyRepository.findById(dto.getCompanyId());
        if (!optional.isPresent()){
            return new Result("Id is not found",false);
        }
        Department department = new Department();
        department.setCompany(optional.get());
        department.setName(dto.getName());
        departmentRepository.save(department);
        return new Result("Successfully added",true);
    }
}
