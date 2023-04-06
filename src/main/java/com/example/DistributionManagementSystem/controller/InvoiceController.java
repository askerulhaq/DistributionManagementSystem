package com.example.DistributionManagementSystem.controller;

import com.example.DistributionManagementSystem.Model.InvoiceModel;
import com.example.DistributionManagementSystem.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @PostMapping("/saveInvoice")
    private InvoiceModel saveInvoice(@RequestBody InvoiceModel invoiceModel){
        return invoiceService.saveInvoice(invoiceModel);
    }

}
