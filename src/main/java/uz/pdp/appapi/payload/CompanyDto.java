package uz.pdp.appapi.payload;

import lombok.Data;
import uz.pdp.appapi.entity.Address;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
public class CompanyDto {

    private int id;

    private String corpName;

    private String directorName;

    private Integer addressId;
}
