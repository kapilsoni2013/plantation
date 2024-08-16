package com.himanshu.plantation.services;

import com.himanshu.plantation.entities.PlantationDrive;
import com.himanshu.plantation.repositories.PlantationDriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantationDriveService {

    @Autowired
    private PlantationDriveRepository repository;

    public List<PlantationDrive> getAllPlantationDrives() {
        return repository.findAll();
    }

    public PlantationDrive getPlantationDriveById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PlantationDrive createPlantationDrive(PlantationDrive plantationDrive) {
        return repository.save(plantationDrive);
    }
}
