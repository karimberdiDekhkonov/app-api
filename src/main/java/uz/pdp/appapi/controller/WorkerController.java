package uz.pdp.appapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appapi.entity.Worker;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.payload.WorkerDto;
import uz.pdp.appapi.service.WorkerService;

@RestController
public class WorkerController {

    @Autowired
    WorkerService service;


    @GetMapping("/worker")
    public HttpEntity<?> getWorkers(@RequestParam int page){
        Page<Worker> workers = service.getWorkers(page);
        return ResponseEntity.status(HttpStatus.OK).body(workers);
    }

    @GetMapping("/worker/{id}")
    public HttpEntity<?> getWorker(@PathVariable Integer id){
        Worker worker = service.getWorker(id);
        return ResponseEntity.status(HttpStatus.OK).body(worker);
    }

    @PostMapping("/worker")
    public HttpEntity<?> addWorker(@RequestBody WorkerDto dto){
        Result result = service.addWorker(dto);
        if (result.isSuccess()){
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
    }
}
