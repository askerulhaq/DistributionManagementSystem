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
    private Double deliveryCharges;
    private Double totalAmount;
    public InvoiceModel (Invoice invoice) {
        this.setInvoiceId(invoice.getInvoiceId());
        this.setNamedAt(invoice.getNamedAt());
        this.setDueDate(invoice.getDueDate());
        this.setDeliveryCharges(invoice.getDeliveryCharges());
        this.setTotalAmount(invoice.getTotalAmount());
    }

    public Invoice dissamble(){
        Invoice invoice = new Invoice();
        OrderModel orderModel1=new OrderModel();
        invoice.setInvoiceId(invoiceId);
        invoice.setNamedAt(this.namedAt);
        invoice.setDueDate(this.dueDate);
        invoice.setDeliveryCharges(this.deliveryCharges);
        invoice.setTotalAmount(this.totalAmount);
        return invoice;

    }
    public InvoiceModel assamble(Invoice invoice){
        InvoiceModel invoiceModel = new InvoiceModel();
        this.setInvoiceId(invoice.getInvoiceId());
        this.setNamedAt(invoice.getNamedAt());
        this.setDueDate(invoice.getDueDate());
        this.setDeliveryCharges(invoice.getDeliveryCharges());
        this.setTotalAmount(invoice.getTotalAmount());
        return invoiceModel;
    }

}
