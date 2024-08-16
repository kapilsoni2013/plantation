package com.himanshu.plantation.repositories;


import com.himanshu.plantation.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
