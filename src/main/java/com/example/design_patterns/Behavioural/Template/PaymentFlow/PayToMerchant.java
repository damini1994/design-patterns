package com.example.design_patterns.Behavioural.Template.PaymentFlow;

public class PayToMerchant extends PaymentFlow{
    @Override
    protected void calculateFees() {
        System.out.println("Merchant: Calculate Amount");
    }

    @Override
    protected void creditAmount() {
        System.out.println("Merchant: Credit Amount");
    }

    @Override
    protected void validateRequest() {
        System.out.println("Merchant: Validating Amount");
    }

    @Override
    protected void debitAmount() {
        System.out.println("Merchant: Debit Amount");
    }
}
