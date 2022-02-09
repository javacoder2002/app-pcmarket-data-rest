package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.MonoBlock;

@Projection(types = MonoBlock.class)
public interface CustomMonoBlock {
    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getVideoCard();

    double getDiagonalScreen();

    String getScreenResolution();

    String getCpu();

    String getRam();

    String getHardDisk();

    String getSsd();

    String getOperationSystem();
}
