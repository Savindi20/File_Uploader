package lk.ijse.file_uploading.service;

import lk.ijse.file_uploading.dto.ImageDTO;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface FileUploadService {
    void saveFileLocation(@ModelAttribute ImageDTO dto);
    String getLastImageLocation();
}
