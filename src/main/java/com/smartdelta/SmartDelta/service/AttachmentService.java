package com.smartdelta.SmartDelta.service;

import com.smartdelta.SmartDelta.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;
    Attachment getAttachment(String fileId) throws Exception;
}
