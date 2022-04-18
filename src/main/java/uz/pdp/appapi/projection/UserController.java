package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.User;
import uz.pdp.appapi.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface UserController {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Boolean getActive();

    Set<Warehouse> getWarehouses();
}
