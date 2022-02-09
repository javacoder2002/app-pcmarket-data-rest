package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Ssd extends AbsEntity {

    private String brand;

    private String execution;

    private String driveType;

    private Integer storageCapacity;

    private String formFactor;

    private String physicalInterface;

}
