package com.project.officeManagement.service;

import com.project.officeManagement.dto.EmployeeRequestDto;
import com.project.officeManagement.entity.Employee;
import com.project.officeManagement.enums.EmployeeRole;
import com.project.officeManagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeRequestDto dto) {

        Employee employee = Employee.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .employeeRole(
                        EmployeeRole.valueOf(dto.getEmployeeRole().toUpperCase())
                )
                .build();

        return employeeRepository.save(employee);
    }
}

