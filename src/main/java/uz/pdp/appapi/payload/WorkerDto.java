package uz.pdp.appapi.payload;

import lombok.Data;
import uz.pdp.appapi.entity.Address;
import uz.pdp.appapi.entity.Department;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
public class WorkerDto {

    private String name;

    private String phoneNumber;

    private Integer addressId;

    private Integer departmentId;
}
