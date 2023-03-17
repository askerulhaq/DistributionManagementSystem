package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DistributionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;
    @Column
    private String generationDate;
    @Column
    private String productName;
    @Column
    private Long quantity;
    @Column
    private String deliveryDate;
    @Column
    private Long orderAmount;
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> products;
    @JoinColumn(name = "vendor_Id")
    private Retailer retailer;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return generationDate;
    }

    public void setOrderDate(String orderDate) {
        this.generationDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(String generationDate) {
        this.generationDate = generationDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
