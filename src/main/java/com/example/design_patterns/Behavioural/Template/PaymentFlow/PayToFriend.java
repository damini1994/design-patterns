package com.example.design_patterns.Behavioural.Template.PaymentFlow;

public class PayToFriend extends PaymentFlow{
    @Override
    protected void calculateFees() {
        System.out.println("Friend: Calculate Amount");
    }

    @Override
    protected void creditAmount() {
        System.out.println("Friend: Credit Amount");
    }

    @Override
    protected void validateRequest() {
        System.out.println("Friend: Validating Amount");
    }

    @Override
    protected void debitAmount() {
        System.out.println("Friend: Debit Amount");
    }
}
