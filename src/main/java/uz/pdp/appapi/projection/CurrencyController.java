package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Currency;


@Projection(types = Currency.class)
public interface CurrencyController {
   Integer getId();

   String getName();

   Boolean getActive();
}
