package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Stock_id")
    private Long stockId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "Available_Quantity")
    private String  availableQuantity;
}


