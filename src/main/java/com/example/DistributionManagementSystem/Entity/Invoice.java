package com.example.DistributionManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long invoiceId;
    @Column
    private Long orderId;
    @Column
    private String namedAt;
    @Column
    private String dueDate;
    @Column
    private String productDescription;
    @Column
    private Long numberOfUnits;
    @Column
    private Double deliveryCharges;
    @Column
    private Double totalAmount;
    @OneToOne
    @JoinColumn(name = "Order_Id")
    private DistributionOrder distributionOrder;
    @OneToOne
    @JoinColumn(name = "vendor_Id")
    private Retailer retailer;


    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getNamedAt() {
        return namedAt;
    }

    public void setNamedAt(String namedAt) {
        this.namedAt = namedAt;
    }

    public Long getNumberOfUnits() {
        return numberOfUnits;
    }

    public Double getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(Double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public void setNumberOfUnits(Long numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }


    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
