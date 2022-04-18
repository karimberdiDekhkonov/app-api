package uz.pdp.appapi.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapi.entity.Attachment;
import uz.pdp.appapi.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentController {
    Integer getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
