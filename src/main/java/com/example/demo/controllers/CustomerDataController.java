package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerDataController {

    @RequestMapping("/customer")
    public String customer() {
        return "customer";
    }
}
