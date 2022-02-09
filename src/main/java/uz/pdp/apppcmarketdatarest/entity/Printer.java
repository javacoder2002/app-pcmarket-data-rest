package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Printer extends AbsEntity {

    private String brand;

    private String printColor;

    private String deviceFeatures;

    private String technology;

    private String maxFormat;

    private String twoSpeedPrinting;

}
