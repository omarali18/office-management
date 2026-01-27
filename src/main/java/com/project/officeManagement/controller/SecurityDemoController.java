package com.project.officeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SecurityDemoController {

    @GetMapping("/public")
    public String publicPage(){
        return "Public page open.";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "Admin page open.";
    }

    @GetMapping("/user")
    public String userPage(){
        return "User page open.";
    }
}
