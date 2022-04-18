package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Category;
import uz.pdp.appapi.projection.CategoryController;

@RepositoryRestResource(path = "category",excerptProjection = CategoryController.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
