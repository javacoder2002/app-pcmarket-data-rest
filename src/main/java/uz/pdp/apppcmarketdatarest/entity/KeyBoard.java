package uz.pdp.apppcmarketdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class KeyBoard extends AbsEntity {

    private String brand;

    private String primarySetColor;

    private String additionalSetColor;

    private String keyBoardKeys;

    private boolean backLight;

    private String keyMechanism;

    private String connectionInterface;

}
