package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Measurement;
import uz.pdp.appapi.projection.MeasurementController;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementController.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

    boolean existsByName(String name);

}
