package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayPalPayment(amount);
    }
}
