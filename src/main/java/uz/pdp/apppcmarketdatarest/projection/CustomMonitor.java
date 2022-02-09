package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.Monitor;

@Projection(types = Monitor.class)
public interface CustomMonitor {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getBrand();

    String getScreenResolution();

    String getVideoConnectors();

    String getMatrix();

    Double getDiagonalScreen();

    boolean getCurvedScreen();

    Integer getScreenRefreshRate();

    String getResponseTime();

}
