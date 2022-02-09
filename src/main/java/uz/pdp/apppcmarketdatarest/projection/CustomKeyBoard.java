package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.entity.KeyBoard;

import java.util.Locale;

@Projection(types = KeyBoard.class)
public interface CustomKeyBoard {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    double getPrice();

    Integer getGuarantee();

    String getDescription();

    String getBrand();

    String getPrimarySetColor();

    String getAdditionalSetColor();

    String getKeyBoardKeys();

    boolean getBackLight();

    String getKeyMechanism();

    String getConnectionInterface();

}