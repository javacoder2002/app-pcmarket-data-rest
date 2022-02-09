package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Laptop extends AbsEntity {

    private String screenResolution;

    private String cpu;

    private String ram;

    private String hardDisk;

    private String ssd;

    private String operationSystem;

}
