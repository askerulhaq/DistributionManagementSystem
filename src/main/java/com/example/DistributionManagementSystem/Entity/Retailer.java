package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Retailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long retailerId;
    @Column
    private String retailerName;
    @Column
    private String city;
    @Column
    private String businessAddress;
    @Column
    private String contact;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Long retailerId) {
        this.retailerId = retailerId;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getVendorContact() {
        return contact;
    }

    public void setVendorContact(String vendorContact) {
        this.contact = contact;
    }

}
