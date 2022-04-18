package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Client;
import uz.pdp.appapi.entity.Currency;
import uz.pdp.appapi.entity.Output;
import uz.pdp.appapi.entity.Warehouse;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputController {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
