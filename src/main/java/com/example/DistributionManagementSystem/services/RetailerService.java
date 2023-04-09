package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.Retailer;
import com.example.DistributionManagementSystem.repository.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailerService {
    @Autowired
    private RetailerRepository retailerRepository;

    public List<Retailer> getAllRetailers() {
        return retailerRepository.findAll();
    }

//    public Retailer getRetailerById(Long id) {
//        return retailerRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException("Retailer not found with id " + id));
//    }

//    public Retailer createRetailer(Retailer retailer) {
//        return retailerRepository.save(retailer);
//    }
//
//    public Retailer updateRetailer(Long id, Retailer retailer) {
//        Retailer existingRetailer = getRetailerById(id);
//        existingRetailer.setRetailerName(retailer.getRetailerName());
//        existingRetailer.setBusinessAddress(retailer.getBusinessAddress());
//        existingRetailer.setContact(retailer.getContact());
//        return retailerRepository.save(existingRetailer);
//    }
//
//    public void deleteRetailer(Long id) {
//        Retailer retailer = getRetailerById(id);
//        retailerRepository.delete(retailer);
//    }
}
