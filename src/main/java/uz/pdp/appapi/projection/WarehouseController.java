package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseController {
    Integer getId();

    String getName();

    Boolean getActive();
}
