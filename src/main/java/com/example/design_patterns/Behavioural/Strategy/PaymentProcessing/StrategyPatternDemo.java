package com.example.design_patterns.Behavioural.Strategy.PaymentProcessing;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");
        cart.addItem("Smartphone");

        // Choose payment strategy: Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/25");
        cart.setPaymentStrategy(creditCard);
        cart.checkout();

        // Choose payment strategy: PayPal
        PaymentStrategy paypal = new PayPalPayment("john.doe@example.com", "password");
        cart.setPaymentStrategy(paypal);
        cart.checkout();

        // Choose payment strategy: Bitcoin
        PaymentStrategy bitcoin = new BitcoinPayment("1A2b3C4d5E6f7G8h9I0j");
        cart.setPaymentStrategy(bitcoin);
        cart.checkout();
    }
}
