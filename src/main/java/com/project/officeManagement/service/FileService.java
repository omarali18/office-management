package com.project.officeManagement.service;

import com.project.officeManagement.dto.FileRequestDto;
import com.project.officeManagement.entity.FileEntity;
import com.project.officeManagement.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FileService {

    private final FileRepository fileRepository;

    private static final String UPLOAD_DIR = "uploads/";

    public FileRequestDto uploadFile(MultipartFile file) {

        if (file.isEmpty()) {
            throw new RuntimeException("File cannot be empty");
        }

        try {
            // Create directory if not exists
            File directory = new File(UPLOAD_DIR);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Generate unique file name
            String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(UPLOAD_DIR + fileName);

            // Save file to local directory
            Files.write(filePath, file.getBytes());

            // Save metadata to DB
            FileEntity fileEntity = FileEntity.builder()
                    .fileName(fileName)
                    .fileType(file.getContentType())
                    .filePath(filePath.toString())
                    .fileSize(file.getSize())
                    .uploadedAt(LocalDateTime.now())
                    .build();

            FileEntity savedFile = fileRepository.save(fileEntity);

            // Return DTO
            return FileRequestDto.builder()
                    .fileName(savedFile.getFileName())
                    .fileType(savedFile.getFileType())
                    .fileSize(savedFile.getFileSize())
                    .uploadedAt(savedFile.getUploadedAt())
                    .build();

        } catch (IOException e) {
            throw new RuntimeException("File upload failed", e);
        }
    }
}
