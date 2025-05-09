package com.example.design_patterns.Behavioural.Strategy.PaymentProcessing;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
        // Implement Bitcoin processing logic here
    }
}
