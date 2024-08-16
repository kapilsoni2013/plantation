package com.himanshu.plantation.services;

import com.himanshu.plantation.entities.Donation;
import com.himanshu.plantation.entities.PaymentMethodDetail;
import com.himanshu.plantation.repositories.DonationRepository;
import com.himanshu.plantation.repositories.PaymentMethodDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    private final PaymentMethodDetailRepository paymentMethodDetailRepository;

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Donation createDonation(Donation donation, Long paymentMethodId) {
        // Fetch the payment method from the repository
        PaymentMethodDetail paymentMethodDetail = paymentMethodDetailRepository.findById(paymentMethodId)
                .orElseThrow(() -> new RuntimeException("Payment method not found"));

        // Set the payment method in the donation
        donation.setPaymentMethodDetail(paymentMethodDetail);

        // Save the donation with the associated payment method
        return donationRepository.save(donation);
    }
}
