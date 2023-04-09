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
    private int orderQuantity;
    private LocalDate generationDate;
    private String deliveryDate;
    private Long orderAmount;
    public OrderModel(DistributionOrder distributionOrder){
        this.setRetailer(distributionOrder.getRetailer());
        this.setOrderQuantity(distributionOrder.getOrderQuantity());
        this.setGenerationDate(distributionOrder.getGenerationDate());
        this.setDeliveryDate(distributionOrder.getDeliveryDate());
        this.setOrderAmount(distributionOrder.getOrderAmount());
    }
    public DistributionOrder dissamble(){
        DistributionOrder distributionOrder = new DistributionOrder();
        distributionOrder.setRetailer(this.retailer);
        distributionOrder.setOrderQuantity(this.orderQuantity);
        distributionOrder.setGenerationDate(this.generationDate);
        distributionOrder.setDeliveryDate(this.deliveryDate);
        distributionOrder.setOrderAmount(this.orderAmount);
        return distributionOrder;
    }
    public OrderModel assamble(){
        OrderModel orderModel = new OrderModel();
        this.setProduct(orderModel.getProduct());
        this.setRetailer(orderModel.getRetailer());
        this.setOrderQuantity(orderModel.getOrderQuantity());
        this.setGenerationDate(orderModel.getGenerationDate());
        this.setDeliveryDate(orderModel.getDeliveryDate());
        this.setOrderAmount(orderModel.getOrderAmount());
        return orderModel;
    }

}
