package com.example.DistributionManagementSystem.Entity.ProductCategories;

import jakarta.persistence.*;

@Entity
@Table
public class Beverage {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private Long Id;
@Column
    private String beveragesName;
@Column
    private String unitPrice;
@Column
    private String expiryDate;

    public Long Id() {
        return Id;
    }

    public void setBeveragesId(Long beveragesId) {
        this.Id = beveragesId;
    }

    public String getBeveragesName() {
        return beveragesName;
    }

    public void setBeveragesName(String beveragesName) {
        this.beveragesName = beveragesName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
