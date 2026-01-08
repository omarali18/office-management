package com.project.officeManagement.controller;

import com.project.officeManagement.dto.EmployeeRequestDto;
import com.project.officeManagement.entity.Employee;
import com.project.officeManagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {

        Employee savedEmployee = employeeService.createEmployee(employeeRequestDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId){
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<Employee> updateEmployee( @RequestBody EmployeeRequestDto Dto, @PathVariable int employeeId){
        return new ResponseEntity<>( employeeService.updateEmployee(Dto, employeeId),  HttpStatus.OK );
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
}
