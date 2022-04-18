package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.Attachment;
import uz.pdp.appapi.projection.AttachmentController;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentController.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
