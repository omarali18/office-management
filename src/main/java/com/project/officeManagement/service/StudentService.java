package com.project.officeManagement.service;

import com.project.officeManagement.dto.StudentDto;
import com.project.officeManagement.entity.Student;
import com.project.officeManagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(StudentDto dto){
        Student student = Student.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .build();
        return studentRepository.save(student);
    }
}
