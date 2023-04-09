package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.Product;
import com.example.DistributionManagementSystem.Model.ProductModel;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
        @Autowired
        private ProductService productRepository;

//    public ProductModel saveProduct(ProductModel productModel) {
//    }

//      //  public List<Product> getAllProducts() {
//            return productRepository.findAll();
//        }

//        public Product getProductById(Long id) {
//            return productRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException("Product not found with id " + id));
//        }
//
//        //public Product createProduct(Product product) {
//            return productRepository.save(product);
//        }

//        public Product updateProduct(Long id, Product product) {
//            Product existingProduct = getProductById(id);
//            existingProduct.setProductName(product.getProductName());
//            existingProduct.setCategory(product.getCategory());
//            existingProduct.setUnitPrice(product.getUnitPrice());
//            existingProduct.setProductDescription(product.getProductDescription());
//            return productRepository.save(existingProduct);
//        }
//
//        public void deleteProduct(Long id) {
//            Product product = getProductById(id);
//            productRepository.delete(product);
//        }
}
