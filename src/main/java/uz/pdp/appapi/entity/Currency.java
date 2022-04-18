package uz.pdp.appapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appapi.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbsEntity {

}
