package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeDataController {

    @GetMapping("/employee")
    public String getEmployee() {
        return "employee.html";
    }
}
