package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Client;
import uz.pdp.appapi.projection.ClientController;

@RepositoryRestResource(path = "client",excerptProjection = ClientController.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByNameAndPhoneNumber(String name,String phoneNumber);
}
