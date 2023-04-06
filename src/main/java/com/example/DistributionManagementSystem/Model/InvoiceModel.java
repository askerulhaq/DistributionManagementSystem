package com.example.DistributionManagementSystem.Model;

import com.example.DistributionManagementSystem.Entity.Invoice;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceModel {
    private Long invoiceId;
    private String namedAt;

    private String dueDate;
    private Long numberOfUnits;
    private Double deliveryCharges;
    private Double totalAmount;
    private OrderModel orderModel;
    public InvoiceModel(Invoice invoice){
        this.setInvoiceId(invoice.getInvoiceId());
        this.setNamedAt(invoice.getNamedAt());
        this.setDueDate(invoice.getDueDate());
        this.setNumberOfUnits(invoice.getNumberOfUnits());
        this.setDeliveryCharges(invoice.getDeliveryCharges());
        this.setTotalAmount(invoice.getTotalAmount());
        this.setOrderModel(new OrderModel(invoice.getDistributionOrder().get()));

    public Invoice dissamble(){
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(this.invoiceId);
        invoice.setNamedAt(this.namedAt);
        invoice.setDueDate(this.dueDate);
        invoice.setNumberOfUnits(this.numberOfUnits);
        invoice.setDeliveryCharges(this.deliveryCharges);
        invoice.setTotalAmount(this.totalAmount);
        invoice.setDistributionOrder(this.orderModel.dissamble());
        return invoice;
        }
    }

}
