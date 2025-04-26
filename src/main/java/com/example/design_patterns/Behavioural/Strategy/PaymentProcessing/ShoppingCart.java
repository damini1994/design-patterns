package com.example.design_patterns.Behavioural.Strategy.PaymentProcessing;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the cart.");
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println(item + " removed from the cart.");
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        double total = calculateTotal();
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
            return;
        }
        System.out.println("Total amount: $" + total);
        paymentStrategy.pay(total);
    }

    private double calculateTotal() {
        // Implement total calculation logic
        return items.size() * 50.0; // Example: each item costs $50
    }
}
