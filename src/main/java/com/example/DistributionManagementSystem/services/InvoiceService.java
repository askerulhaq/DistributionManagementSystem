package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.DistributionOrder;
import com.example.DistributionManagementSystem.Entity.Invoice;
import com.example.DistributionManagementSystem.Entity.Retailer;
import com.example.DistributionManagementSystem.Model.CategoryModel;
import com.example.DistributionManagementSystem.Model.InvoiceModel;
import com.example.DistributionManagementSystem.repository.CategoryRepository;
import com.example.DistributionManagementSystem.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public InvoiceModel saveInvoice(InvoiceModel invoiceModel) {
        Invoice invoice=invoiceRepository.save(invoiceModel.dissamble());
        InvoiceModel invoiceModel1=new InvoiceModel();
        return invoiceModel1.assamble(invoice);
    }

//    public List<Invoice> getInvoiceForRetailer(Retailer retailer) {
//        List<Invoice> customerInvoices = new ArrayList<>();
//        for (Invoice invoice : invoices) {
//            if (invoice.getDistributionOrder().getRetailer().equals(retailer)) {
//                customerInvoices.add(invoice);
//            }
//        }
//        return customerInvoices;
//    }
}
