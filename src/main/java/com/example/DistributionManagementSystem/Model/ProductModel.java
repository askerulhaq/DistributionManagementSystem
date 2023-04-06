package com.example.DistributionManagementSystem.Model;

import com.example.DistributionManagementSystem.Entity.Category;
import com.example.DistributionManagementSystem.Entity.Product;
import com.example.DistributionManagementSystem.Entity.Stock;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductModel {
    private Long productId;
    private String productName;
    private int unitPrice;
    private String productDescription;
    private Category category;
    private Stock stock;
    public ProductModel(Product product){
        this.setProductId(product.getProductId());
        this.setProductName(product.getProductName());
        this.setUnitPrice(product.getUnitPrice());
        this.setProductDescription(product.getProductDescription());
        this.setCategory(product.getCategory());
        this.setStock(product.getStock().get());
    }
    public Product dissamble(){
        Product product = new Product();
        this.setProductId(this.productId);
        this.setProductName(this.productName);
        this.setUnitPrice(this.unitPrice);
        this.setProductDescription(this.productDescription);
        this.setCategory(this.category);
        this.setStock(this.stock);
    }
}
