package com.example.design_patterns.Behavioural.Strategy.PaymentProcessing;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Implement PayPal processing logic here
    }
}
