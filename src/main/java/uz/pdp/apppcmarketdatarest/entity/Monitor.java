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
public class Monitor extends AbsEntity {

    private String brand;

    private String screenResolution;

    private String videoConnectors;

    private String matrix;

    private Double diagonalScreen;

    private boolean curvedScreen;

    private Integer screenRefreshRate;

    private String responseTime;

}
