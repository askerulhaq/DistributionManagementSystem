package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.DistributionOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributionOrderServices {
    @Autowired
    private InvoiceService invoiceService;

    public void placeOrder(DistributionOrder distributionOrder) throws OutOfStockException {
        for (OrderItem item : distributionOrder.getItems()) {
            if (stockService.getStockLevel(item.getProduct()) < item.getQuantity()) {
                throw new OutOfStockException("Product out of stock: " + item.getProduct().getName());
            }
        }

        for (OrderItem item : distributionOrder.getItems()) {
            stockService.reduceStockLevel(item.getProduct(), item.getQuantity());
        }

        invoiceService.createInvoice(distributionOrder);
    }
}
