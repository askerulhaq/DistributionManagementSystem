package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.ProductCategories.BreadAndBakery;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaucesAndOils extends JpaRepository<Long, Id> {
}
