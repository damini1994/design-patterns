package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

//Adaptee
public class Stripe {
    public void makeStripePayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
