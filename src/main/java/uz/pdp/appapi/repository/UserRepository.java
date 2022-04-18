package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.User;
import uz.pdp.appapi.projection.UserController;

@RepositoryRestResource(path = "user",excerptProjection = UserController.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
