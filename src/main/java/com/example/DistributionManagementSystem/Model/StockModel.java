//package com.example.DistributionManagementSystem.Model;
//
//import com.example.DistributionManagementSystem.Entity.Product;
////import com.example.DistributionManagementSystem.Entity.Stock;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//public class StockModel {
//    private Long stockId;
//    private Product product;
//    private String  availableQuantity;
//    public StockModel(Stock stock){
//        this.setStockId(stock.getStockId());
//        this.setProduct(stock.getProduct());
//        this.setAvailableQuantity(stock.getAvailableQuantity());
//    }
//    public Stock dissamble(){
//        Stock stock = new Stock();
//        this.setStockId(this.stockId);
//        this.setProduct(this.product);
//        this.setAvailableQuantity(this.availableQuantity);
//        return stock;
//    }
//    public StockModel assamble(){
//        StockModel stockModel = new StockModel();
//        this.setStockId(stockModel.getStockId());
//        this.setProduct(stockModel.getProduct());
//        this.setAvailableQuantity(stockModel.getAvailableQuantity());
//        return stockModel;
//    }
//
//
//}
