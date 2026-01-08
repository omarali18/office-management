package com.project.officeManagement.service;

import com.project.officeManagement.dto.EmployeeRequestDto;
import com.project.officeManagement.entity.Employee;
import com.project.officeManagement.enums.EmployeeRole;
import com.project.officeManagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employeeId) {
        return employeeRepository.getOne(employeeId);
    }

    public Employee updateEmployee(EmployeeRequestDto dto, int employeeId) {
        Employee e = employeeRepository.findById(employeeId).get();
            e.setName(dto.getName());
            e.setEmail(dto.getEmail());
            e.setPhoneNumber(dto.getPhoneNumber());
            e.setEmployeeRole(EmployeeRole.valueOf(dto.getEmployeeRole().toUpperCase()));
            return employeeRepository.save(e);

    }

    public String deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Employee deleted successfully";
    }
}

