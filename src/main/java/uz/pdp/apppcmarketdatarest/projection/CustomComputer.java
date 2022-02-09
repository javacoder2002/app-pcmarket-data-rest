package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.Computer;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Computer.class)
public interface CustomComputer {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getMotherBoard();

    String getCpu();

    boolean getCollingSystem();

    String getRam();

    String getSsd();

    String getPowerSupply();

    String getFrame();

    String getOperationSystem();

}
