package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
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
    @Column(name = "number_of_units")
    private Long numberOfUnits;
    @Column(name = "delivery_charges")
    private Double deliveryCharges;
    @Column(name = "total_amount")
    private Double totalAmount;
    @ManyToOne
    @JoinColumn(name = "retailer_id")
    private Retailer retailer;
    @OneToMany(mappedBy = "order_id")
    private List<DistributionOrder> distributionOrder;
}
