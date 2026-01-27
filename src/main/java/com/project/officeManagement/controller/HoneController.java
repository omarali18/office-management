package com.project.officeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HoneController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
