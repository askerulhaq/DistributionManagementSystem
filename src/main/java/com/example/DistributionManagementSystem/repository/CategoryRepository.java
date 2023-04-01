package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.Category;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
