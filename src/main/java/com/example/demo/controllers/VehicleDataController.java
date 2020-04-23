package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleDataController {

    @RequestMapping("/vehicle")
    public String vehicle() {
        return "vehicle";
    }
}
