package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Attachment;
import uz.pdp.appapi.entity.Category;
import uz.pdp.appapi.entity.Measurement;
import uz.pdp.appapi.entity.Product;

@Projection(types = Product.class)
public interface ProductController {
    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
