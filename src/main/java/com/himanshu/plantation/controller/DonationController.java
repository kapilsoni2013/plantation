package com.himanshu.plantation.controller;

import com.himanshu.plantation.entities.Donation;
import com.himanshu.plantation.services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {

    @Autowired
    private DonationService service;

    @GetMapping
    public List<Donation> getAllDonations() {
        return service.getAllDonations();
    }

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation, @RequestParam Long paymentMethodId) {
        return service.createDonation(donation, paymentMethodId);
    }
}
