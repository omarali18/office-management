package com.project.officeManagement.controller;

import com.project.officeManagement.dto.FileRequestDto;
import com.project.officeManagement.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public ResponseEntity<FileRequestDto> uploadFile(
            @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(fileService.uploadFile(file));
    }
}
