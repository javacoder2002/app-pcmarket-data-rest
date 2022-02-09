package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.Printer;

@Projection(types = Printer.class)
public interface CustomPrinter {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getBrand();

    String getPrintColor();

    String getDeviceFeatures();

    String getTechnology();

    String getMaxFormat();

    String getTwoSpeedPrinting();

}
