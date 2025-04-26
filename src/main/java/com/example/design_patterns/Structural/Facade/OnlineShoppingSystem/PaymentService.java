package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class PaymentService {

    public void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " using " + paymentMethod);
    }
}
