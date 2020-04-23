package com.example.demo.controllers;

import com.example.demo.models.VehicleData;
import com.example.demo.models.VehicleDataRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/vehicle/")
public class VehicleDataController {

    final VehicleDataRepo vehicleDataRepo;

    @Autowired
    public VehicleDataController(VehicleDataRepo vehicleDataRepo) {
        this.vehicleDataRepo = vehicleDataRepo;
    }

    @GetMapping("newvehicle")
    public String showAddVehicle(VehicleData vehicleData) {
        return "vehicle_add";
    }

    @GetMapping("vehiclelist")
    public String vehiclelist(Model model) {
        model.addAttribute("vehicledata", vehicleDataRepo.findAll());
        return "vehicle";
    }
    @PostMapping("addvehicle")
    public String addvehicle(@Valid VehicleData vehicleData, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "vehicle_add";
        }

        vehicleDataRepo.save(vehicleData);
        return "redirect:vehiclelist";
    }

    @GetMapping("edit/{vehicleid}")
    public String showAddVehicle(@PathVariable("vehicleid") long vehicleid, Model model) {
        VehicleData vehicleData = vehicleDataRepo.findById(vehicleid)
                .orElseThrow(()-> new IllegalArgumentException("Vehicle ID:" + vehicleid + "is not valid" ));
        model.addAttribute("vehicledata", vehicleData);
        return "vehicle_update";

    }

    @PostMapping("update/{vehicleid}")
    public String deletevehicle(@PathVariable("vehicleid") long vehicleid, @Valid VehicleData vehicleData, BindingResult result, Model model) {
        if (result.hasErrors()) {
            vehicleData.setVehicleid(vehicleid);
            return "vehicle_update";
        }
        vehicleDataRepo.save(vehicleData);
        model.addAttribute("vehicledata", vehicleDataRepo.findAll());
        return "vehicle";
    }

    @GetMapping("delete/{vehicleid")
    public String deleteVehicle(@PathVariable("vehicleid")long vehicleid, Model model) {
        VehicleData vehicleData = vehicleDataRepo.findById(vehicleid)
                .orElseThrow(()-> new IllegalArgumentException("Vehicle ID:" + vehicleid + "is not valid" ));;
        vehicleDataRepo.delete(vehicleData);
        model.addAttribute("vehicledata", vehicleDataRepo.findAll());
        return "vehicle";


    }




}
