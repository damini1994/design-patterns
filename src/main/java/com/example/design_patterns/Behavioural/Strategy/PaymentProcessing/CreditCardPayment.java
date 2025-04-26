package com.example.design_patterns.Behavioural.Strategy.PaymentProcessing;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Implement credit card processing logic here
    }
}
