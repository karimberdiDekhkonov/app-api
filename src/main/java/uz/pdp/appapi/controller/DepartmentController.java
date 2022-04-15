package uz.pdp.appapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appapi.entity.Department;
import uz.pdp.appapi.payload.DepartmentDto;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService service;

    @GetMapping("/department")
    public HttpEntity<?>getDepartments(@RequestParam int page){
        Page<Department> departments = service.getDepartments(page);
        return ResponseEntity.status(HttpStatus.OK).body(departments);
    }

    @GetMapping("/deparment/{id}")
    public HttpEntity<?>getDepartment(@PathVariable Integer id){
        Department department = service.getDepartment(id);
        return ResponseEntity.status(HttpStatus.OK).body(department);
    }

    @PostMapping("/department")
    HttpEntity<?> addDepartment(@RequestBody DepartmentDto dto){
        Result result = service.addDepartment(dto);
        if (result.isSuccess()){
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
    }
}
