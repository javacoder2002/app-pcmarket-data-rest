package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.Laptop;

@Projection(types = Laptop.class)
public interface CustomLaptop {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getScreenResolution();

    String getCpu();

    String getRam();

    String getHardDisk();

    String getSsd();

    String getOperationSystem();

}
