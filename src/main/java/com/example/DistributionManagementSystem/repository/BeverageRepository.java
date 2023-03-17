package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.ProductCategories.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
