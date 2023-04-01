package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class InvoiceModel {

    private String namedAt;

    private String dueDate;
    private Long numberOfUnits;
    private Double deliveryCharges;
    private Double totalAmount;


}
