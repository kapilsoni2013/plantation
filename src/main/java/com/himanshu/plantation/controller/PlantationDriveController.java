package com.himanshu.plantation.controller;

import com.himanshu.plantation.entities.PlantationDrive;
import com.himanshu.plantation.services.PlantationDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantation-drives")
public class PlantationDriveController {

    @Autowired
    private PlantationDriveService service;

    @GetMapping
    public List<PlantationDrive> getAllPlantationDrives() {
        return service.getAllPlantationDrives();
    }

    @GetMapping("/{id}")
    public PlantationDrive getPlantationDriveById(@PathVariable Long id) {
        return service.getPlantationDriveById(id);
    }

    @PostMapping
    public PlantationDrive createPlantationDrive(@RequestBody PlantationDrive plantationDrive) {
        return service.createPlantationDrive(plantationDrive);
    }
}
