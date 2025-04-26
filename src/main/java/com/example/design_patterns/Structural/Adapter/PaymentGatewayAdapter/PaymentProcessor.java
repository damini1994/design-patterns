package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

//Target
public interface PaymentProcessor {
    void processPayment(double amount);
}
