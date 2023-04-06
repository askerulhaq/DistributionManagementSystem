package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.DistributionOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionOrderRepository extends JpaRepository<DistributionOrder, Long> {
}
