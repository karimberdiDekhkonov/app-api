package uz.pdp.appapi.projection;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Attachment;
@Projection(types = Attachment.class)
public interface AttachmentController {
    Integer getId();

    String getName();

    Long getSize();

    String getContentType();
}
