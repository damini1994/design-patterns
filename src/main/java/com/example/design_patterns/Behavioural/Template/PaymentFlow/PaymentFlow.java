package com.example.design_patterns.Behavioural.Template.PaymentFlow;

public abstract class PaymentFlow {

    public final void sendMoney(){
        validateRequest();
        debitAmount();
        calculateFees();
        creditAmount();
    }

    protected abstract void calculateFees();

    protected abstract void creditAmount();

    protected abstract void validateRequest();

    protected abstract void debitAmount();
}
