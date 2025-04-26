package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class InventoryService {

    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }

    public String getProductDetails(String productId) {
        return "Product Details for " + productId;
    }
}
