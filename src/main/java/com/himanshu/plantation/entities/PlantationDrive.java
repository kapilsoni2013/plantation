package com.himanshu.plantation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class PlantationDrive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private int targetTrees;
    private int currentTreesPlanted;

    // Getters and Setters
}
