package uz.pdp.appapi.service;

import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appapi.entity.Address;
import uz.pdp.appapi.entity.Department;
import uz.pdp.appapi.entity.Worker;
import uz.pdp.appapi.payload.Result;
import uz.pdp.appapi.payload.WorkerDto;
import uz.pdp.appapi.repository.AddressRepository;
import uz.pdp.appapi.repository.DepartmentRepository;
import uz.pdp.appapi.repository.WorkerRepository;

import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    WorkerRepository workerRepository;

    public Page<Worker> getWorkers(int page){
        Pageable pageable = PageRequest.of(page,10);
        return workerRepository.findAll(pageable);
    }

    public Worker getWorker(Integer id){
        Optional<Worker> optional = workerRepository.findById(id);

        if (!optional.isPresent()){
            return new Worker();
        }
        return optional.get();
    }

    public Result addWorker(WorkerDto dto){
        Optional<Department> optionalDepartment = departmentRepository.findById(dto.getDepartmentId());
        if (!optionalDepartment.isPresent()){
            return new Result("Error",false);
        }
        Optional<Address> optionalAddress = addressRepository.findById(dto.getAddressId());
        if (!optionalAddress.isPresent()){
            return new Result("Error",false);
        }

        Worker worker = new Worker();
        worker.setAddress(optionalAddress.get());
        worker.setDepartment(optionalDepartment.get());
        worker.setName(dto.getName());
        worker.setPhoneNumber(dto.getPhoneNumber());
        workerRepository.save(worker);
        return new Result("Success",true);
    }
}
