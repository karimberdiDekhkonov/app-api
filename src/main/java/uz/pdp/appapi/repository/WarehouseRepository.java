package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Warehouse;
import uz.pdp.appapi.projection.WarehouseController;

@RepositoryRestResource(path = "warehouse",excerptProjection = WarehouseController.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
