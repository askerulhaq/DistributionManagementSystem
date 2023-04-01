package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
