package com.himanshu.plantation.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String role;

    // Getters and Setters
}