package uz.pdp.appapi.projection;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Category;

@Projection(types = Category.class)
public interface CategoryController {
    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();
}
