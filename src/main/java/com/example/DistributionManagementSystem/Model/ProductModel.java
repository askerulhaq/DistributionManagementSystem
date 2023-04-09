package com.example.DistributionManagementSystem.Model;

import com.example.DistributionManagementSystem.Entity.Category;
import com.example.DistributionManagementSystem.Entity.Product;
//import com.example.DistributionManagementSystem.Entity.Stock;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductModel {
    private Long productId;
    private String productName;
    private int unitPrice;
    private String productDescription;
    private Category category;
//    private Stock stock;
    public ProductModel(Product product){
        this.setProductId(product.getProductId());
        this.setProductName(product.getProductName());
        this.setUnitPrice(product.getUnitPrice());
        this.setProductDescription(product.getProductDescription());
        this.setCategory(product.getCategory());
    }
    public Product dissamble(){
        Product product = new Product();
        this.setProductId(this.productId);
        this.setProductName(this.productName);
        this.setUnitPrice(this.unitPrice);
        this.setProductDescription(this.productDescription);
        this.setCategory(this.category);
//        this.setStock(this.stock);
        return product;
    }
    public ProductModel assamble(){
        ProductModel productModel = new ProductModel();
        this.setProductId(productModel.getProductId());
        this.setProductName(productModel.getProductName());
        this.setUnitPrice(productModel.getUnitPrice());
        this.setProductDescription(productModel.getProductDescription());
        this.setCategory(productModel.getCategory());
//        this.setStock(productModel.getStock());
        return productModel;
    }
}
