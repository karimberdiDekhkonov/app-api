package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Client;

@Projection(types = Client.class)
public interface ClientController {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}
