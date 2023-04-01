package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.Retailer;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetailerRepository extends JpaRepository<Retailer, Long> {
}
