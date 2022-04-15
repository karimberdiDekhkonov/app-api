package uz.pdp.appapi.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appapi.entity.Address;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    AddressService service;

    @GetMapping("/address")
    public HttpEntity<?> getAddresses(@RequestParam int page){
        Page<Address> addresses = service.getAddresses(page);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(addresses);
    }
    @GetMapping("/address/{id}")
    public HttpEntity<?> getAddress(@PathVariable Integer id){
        Address address = service.getAddress(id);
        return ResponseEntity.status(HttpStatus.OK).body(address);
    }
    @PostMapping("/address")
    public HttpEntity<?> addAddress(@RequestBody Address address){
        Result result = service.addAddress(address);
        if (result.isSuccess()){
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
    }
}
