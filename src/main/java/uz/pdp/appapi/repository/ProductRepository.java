package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Product;
import uz.pdp.appapi.projection.ProductController;

@RepositoryRestResource(path = "product",excerptProjection = ProductController.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {


}
