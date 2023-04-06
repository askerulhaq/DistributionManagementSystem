package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StockService {
    private Map<Product, Integer> stock = new HashMap<>();

    public int getStockLevel(Product product) {
        return stock.getOrDefault(product, 0);
    }

    public void addStockLevel(Product product, int quantity) {
        stock.put(product, getStockLevel(product) + quantity);
    }

    public void reduceStockLevel(Product product, int quantity) {
        int currentStockLevel = getStockLevel(product);
        if (currentStockLevel >= quantity) {
            stock.put(product, currentStockLevel - quantity);
        } else {
            throw new IllegalArgumentException("Not enough stock available for product: " + product.getStock());
        }
    }
}
