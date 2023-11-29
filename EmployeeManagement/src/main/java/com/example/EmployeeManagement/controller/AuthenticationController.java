package com.example.EmployeeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthenticationController {

    @GetMapping("/")
    public String showHome() {

        return "employees/home";
    }
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {

        return "employees/login";
    }


    @GetMapping("/access-denied")
    public String showAccessDenied() {

        return "employees/access-denied";
    }



}
