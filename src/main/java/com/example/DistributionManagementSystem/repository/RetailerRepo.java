package com.example.DistributionManagementSystem.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetailerRepo extends JpaRepository<Long, Id> {
}
