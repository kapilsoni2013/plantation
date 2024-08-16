package com.himanshu.plantation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PaymentMethodDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Reference to the user who owns this payment method details

    private String paymentMethodType; //The type of payment method (e.g., 'Credit Card', 'PayPal')
    private String paymentDetails; // Additional details about the payment method (e.g., encrypted card information) [UPI ID or Debit/Credit Card Number]

    @OneToMany(mappedBy = "paymentMethodDetail")
    private List<Donation> donations;  // List of donations associated with this payment method

    // Getters and Setters
}
