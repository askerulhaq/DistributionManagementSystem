package com.example.DistributionManagementSystem.controller;

import com.example.DistributionManagementSystem.Entity.ProductCategories.Beverage;
import com.example.DistributionManagementSystem.repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Beverages")
public class BeverageController {
    @Autowired
    private BeverageRepository beverageRepository;
    @PostMapping("/saveBeverages")
    public Beverage saveBeverages(@RequestBody BeverageModel beverage){
        beverage.getName
        return beverageRepository.save(beverage);
   }
    @GetMapping ("/getbeverages/{id}")
    public Beverage getBeverages(@PathVariable Long id){
        return beverageRepository.findById(id).get();
    }
    @DeleteMapping("/deleteBeverages/{id}")
    public String  deleteBeverages(@PathVariable Long id){
        beverageRepository.deleteById(id);
        return "This Beverage has been deleted";
    }

}
