package lk.ijse.file_uploading.service;

import lk.ijse.file_uploading.dto.ImageDTO;
import lk.ijse.file_uploading.dto.ImageDTO;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

public interface FileUploadService {
    void saveFileLocation(@ModelAttribute ImageDTO dto);
    ArrayList<ImageDTO> loadFileLocation();
}