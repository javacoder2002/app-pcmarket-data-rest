package uz.pdp.apppcmarketdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.apppcmarketdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Mouse extends AbsEntity {

    private String brand;

    private String sensorResolution;

    private Integer maxAcceleration;

    private Integer numberOfButtons;

    private String connectionType;

    private boolean silentButtons;

    private String connectionInterface;

}
