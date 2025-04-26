package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class OrderService {

    public void placeOrder(String productId, int quantity) {
        System.out.println("Placing order for " + quantity + " unit(s) of " + productId);
    }

    public String trackOrder(String orderId) {
        return "Tracking details for order " + orderId;
    }
}
