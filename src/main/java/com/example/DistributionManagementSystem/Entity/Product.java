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
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private int unitPrice;
    @Column(name = "Product_description")
    private String productDescription;
    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category category;
    @OneToOne(mappedBy = "product")
    private List<Stock> stock;
}
