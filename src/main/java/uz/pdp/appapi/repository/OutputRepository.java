package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Output;
import uz.pdp.appapi.projection.OutputController;

@RepositoryRestResource(path = "output",excerptProjection = OutputController.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
