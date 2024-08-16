package com.himanshu.plantation.security;

import com.himanshu.plantation.entities.User;
import com.himanshu.plantation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        // Encrypt the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        // Set default role
        user.setRole("USER");

        return userRepository.save(user);
    }
}
