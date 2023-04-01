package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductModel {
    private String productName;
    private int unitPrice;
}
