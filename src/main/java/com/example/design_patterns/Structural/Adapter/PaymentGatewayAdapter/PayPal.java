package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

//Adaptee
public class PayPal {

    public void makePayPalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
