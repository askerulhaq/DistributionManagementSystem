package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class DistributionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "generation_date")
    private String generationDate;
    @Column(name = "product-name")
    private String productName;
    @Column(name = "Product_description")
    private String productDescription;
    @Column(name = "order_quantity")
    private Long orderQuantity;
    @Column(name = "delivery_date")
    private String deliveryDate;
    @Column(name = "order_amount")
    private Long orderAmount;
   @ManyToOne
   @JoinColumn(name = "product_id")
   private Product product;
   @OneToOne
   @JoinColumn(name = "retailer_id")
   private Retailer retailer;
    @OneToOne(mappedBy = "distributionOrder")
    private Invoice invoice;


}
