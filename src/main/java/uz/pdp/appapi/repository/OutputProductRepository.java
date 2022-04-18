package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.OutputProduct;
import uz.pdp.appapi.projection.OutputProductController;

@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductController.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
