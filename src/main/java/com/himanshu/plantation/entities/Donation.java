package com.himanshu.plantation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String treeName;
    private Date donationDate;

    @ManyToOne
    @JoinColumn(name = "payment_method_detail_id")  // This links the payment method in Donation table
    private PaymentMethodDetail paymentMethodDetail;  // Payment method associated with this donation


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "gift_to_user_id")
    private User giftToUser;

    @ManyToOne
    @JoinColumn(name = "plantation_drive_id")
    private PlantationDrive plantationDrive;

    // Getters and Setters
}
