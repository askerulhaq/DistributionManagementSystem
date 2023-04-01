package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_Id")
    private Long productId;
    @Column(name = "Product_name")
    private String productName;
    @Column(name = "Unit_price")
    private int unitPrice;
    @OneToMany(mappedBy = "product")
    private List<DistributionOrder> distributionOrderlist;
    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category category;
    @OneToOne(mappedBy = "product")
    private Stock stock;
}
