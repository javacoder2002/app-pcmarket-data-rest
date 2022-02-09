package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class GameChair extends AbsEntity {

    private String color;

    private String forPeopleLength;

    private double load;

    private String gasLiftClass;

    private double weight;

    private String frameMaterial;

    private String size; //60x80x120

    private String movementType;

}
