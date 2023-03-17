package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;

public class InvoiceModel {

    private String namedAt;

    private String dueDate;

    private String productDescription;

    private Long numberOfUnits;
    private Double deliveryCharges;
    private Double totalAmount;
}
