package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Currency;
import uz.pdp.appapi.projection.CurrencyController;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyController.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

    boolean findByName(String name);

}
