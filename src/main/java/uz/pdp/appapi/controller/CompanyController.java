package uz.pdp.appapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appapi.entity.Company;
import uz.pdp.appapi.payload.CompanyDto;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.service.CompanyService;

@RestController
public class CompanyController {

    @Autowired
    CompanyService service;

    @GetMapping("/company")
    public HttpEntity<?> getCompanies(@RequestParam int page){
        Page<Company> companies = service.getCompanies(page);
        return ResponseEntity.status(HttpStatus.OK).body(companies);
    }
    @GetMapping("/company/{id}")
    public HttpEntity<?> getCompany(@PathVariable Integer id){
        Company company = service.getCompany(id);
        return ResponseEntity.status(HttpStatus.OK).body(company);
    }
    @PostMapping("/company")
    public HttpEntity<?> addCompany(@RequestBody CompanyDto dto){
        Result result = service.addCompany(dto);
        if (result.isSuccess()){
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
    }
}
