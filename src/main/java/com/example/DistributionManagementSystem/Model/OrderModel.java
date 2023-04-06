package com.example.DistributionManagementSystem.Model;

import com.example.DistributionManagementSystem.Entity.DistributionOrder;
import com.example.DistributionManagementSystem.Entity.Product;
import com.example.DistributionManagementSystem.Entity.Retailer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class OrderModel {
    private Product product;
    private Retailer retailer;
    private Long orderQuantity;
    private LocalDate generationDate;
    private String deliveryDate;
    private Long orderAmount;
    public OrderModel(DistributionOrder distributionOrder){
        this.setProduct(distributionOrder.getProduct());
        this.setRetailer(distributionOrder.getRetailer());
        this.setOrderQuantity(distributionOrder.getOrderQuantity());
        this.setGenerationDate(distributionOrder.getGenerationDate());
        this.setDeliveryDate(distributionOrder.getDeliveryDate());
        this.setOrderAmount(distributionOrder.getOrderAmount());
    }
    public DistributionOrder dissamble(){
        DistributionOrder distributionOrder = new DistributionOrder();
        distributionOrder.setProduct(this.product);
        distributionOrder.setRetailer(this.retailer);
        distributionOrder.setOrderQuantity(this.orderQuantity);
        distributionOrder.setGenerationDate(this.generationDate);
        distributionOrder.setDeliveryDate(this.deliveryDate);
        distributionOrder.setOrderAmount(this.orderAmount);
        return distributionOrder;
    }

}
