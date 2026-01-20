package com.project.officeManagement.controller;

import com.project.officeManagement.dto.UserRequestDto;
import com.project.officeManagement.entity.OrderEntity;
import com.project.officeManagement.entity.UserEntity;
import com.project.officeManagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserRequestDto userRequestDto) {

        return ResponseEntity.ok(userService.createUser(userRequestDto));
    }
}
