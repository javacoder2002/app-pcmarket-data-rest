package uz.pdp.apppcmarketdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarketdatarest.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Category getCategory();

}
