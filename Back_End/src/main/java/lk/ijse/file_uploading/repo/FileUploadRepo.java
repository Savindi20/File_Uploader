package lk.ijse.file_uploading.repo;

import lk.ijse.file_uploading.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepo extends JpaRepository<Image, String> {
}