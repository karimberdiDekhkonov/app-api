package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Output;
import uz.pdp.appapi.entity.OutputProduct;
import uz.pdp.appapi.entity.Product;
@Projection(types = OutputProduct.class)
public interface OutputProductController {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
