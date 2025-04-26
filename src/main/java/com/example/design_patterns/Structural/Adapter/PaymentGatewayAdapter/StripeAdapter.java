package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makeStripePayment(amount);
    }
}