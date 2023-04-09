package com.example.DistributionManagementSystem.controller;

import com.example.DistributionManagementSystem.Model.CategoryModel;
import com.example.DistributionManagementSystem.Model.ProductModel;
import com.example.DistributionManagementSystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
//    @PostMapping("/saveProduct")
//    private ProductModel saveProduct(@RequestBody ProductModel productModel){
//        return productService.saveProduct(productModel);
//    }
//    @GetMapping("/getProduct/")
//    private ProductModel getProduct(@PathVariable ProductModel productModel){
//        return (ProductModel) productModel.getProductId();
//    }
    @DeleteMapping("/deleteProduct/{id}")
    private String deleteProduct(@PathVariable ProductModel productModel){
        return "Product is deleted";
    }
}
