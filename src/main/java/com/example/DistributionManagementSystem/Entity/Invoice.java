package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="invoice")
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long invoiceId;

    @Column(name = "named_at")
    private String namedAt;
    @Column(name = "due_date")
    private String dueDate;
    @Column(name = "delivery_charges")
    private Double deliveryCharges;
    @Column(name = "total_amount")
    private Double totalAmount;

    @OneToOne
    @JoinColumn(name = "order_id")
    private DistributionOrder distributionOrder;
}
