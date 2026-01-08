package com.project.officeManagement.controller;

import com.project.officeManagement.dto.EmployeeRequestDto;
import com.project.officeManagement.entity.Employee;
import com.project.officeManagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {

        Employee savedEmployee = employeeService.createEmployee(employeeRequestDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
