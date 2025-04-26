package com.example.design_patterns.Structural.Adapter.PaymentGatewayAdapter;

//An e-commerce application needs to integrate with multiple payment gateways (e.g., PayPal and Stripe).
// Each gateway has its own interface. We'll use the Adapter pattern to unify these interfaces under a common PaymentProcessor interface
public class Client {
    private PaymentProcessor paymentProcessor;

    // Constructor accepts any PaymentProcessor implementation
    public Client(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        System.out.println("Initiating checkout...");
        paymentProcessor.processPayment(amount);
        System.out.println("Checkout complete.\n");
    }

    public static void main(String[] args) {
        // Using PayPal
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        Client appWithPayPal = new Client(payPalAdapter);
        appWithPayPal.checkout(150.00);

        // Using Stripe
        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        Client appWithStripe = new Client(stripeAdapter);
        appWithStripe.checkout(200.00);
    }
}
