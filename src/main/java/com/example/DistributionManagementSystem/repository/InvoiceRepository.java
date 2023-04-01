package com.example.DistributionManagementSystem.repository;

import com.example.DistributionManagementSystem.Entity.Invoice;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
