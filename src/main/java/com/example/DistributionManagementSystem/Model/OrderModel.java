package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OrderModel {
    private String generationDate;

    private String productName;
    private String productDescription;

    private Long orderQuantity;

    private String deliveryDate;

    private Long orderAmount;

}
