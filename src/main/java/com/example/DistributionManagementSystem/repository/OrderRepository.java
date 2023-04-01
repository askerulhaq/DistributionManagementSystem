package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.DistributionOrder;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<DistributionOrder, Long> {
}
