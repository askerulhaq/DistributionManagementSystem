package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="distributionOrder")
@Data
public class DistributionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "generation_date")
    private LocalDate generationDate;
    @Column(name = "order_quantity")
    private int orderQuantity;
    @Column(name = "delivery_date")
    private String deliveryDate;
    @Column(name = "order_amount")
    private Long orderAmount;

    @OneToMany
   private List<Product> product;

   @OneToOne
   private Retailer retailer;

   @Enumerated
   private OrderStatus status;

}
