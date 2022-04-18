package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapi.entity.AttachmentContent;
import uz.pdp.appapi.projection.AttachmentContentController;

import java.util.Optional;
@RepositoryRestResource(path = "attachmentContent",excerptProjection = AttachmentContentController.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    Optional<AttachmentContent> findByAttachment_Id(Integer id);

}
