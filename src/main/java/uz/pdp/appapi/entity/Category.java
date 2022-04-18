package uz.pdp.appapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appapi.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends AbsEntity {

    @ManyToOne
    private Category category;
}
