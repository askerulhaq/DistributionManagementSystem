package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Retailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "retailer_Id")

    private Long retailerId;
    @Column(name = "retailer_name")
    private String retailerName;
    @Column(name = "city")
    private String city;
    @Column(name = "business_address")
    private String businessAddress;
    @Column(name = "contact")
    private String contact;
    @OneToMany(mappedBy = "retailer")
    private List<DistributionOrder> distributionOrders;
}
