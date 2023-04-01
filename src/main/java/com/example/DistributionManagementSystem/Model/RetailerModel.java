package com.example.DistributionManagementSystem.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RetailerModel {
    private String retailerName;

    private String city;

    private String businessAddress;

    private String contact;

}
