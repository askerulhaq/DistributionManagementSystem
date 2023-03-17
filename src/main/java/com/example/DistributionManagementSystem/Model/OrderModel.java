package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;

public class OrderModel {
    private String generationDate;

    private String productName;

    private Long quantity;

    private String deliveryDate;

    private Long orderAmount;
}
