package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Ram extends AbsEntity {

    private String brand;

    private Integer memory;

    private Integer clockFrequency;

    private String memoryType;

    private boolean forLaptop;

}
