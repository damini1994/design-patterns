package com.example.design_patterns.Behavioural.Template.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendMoney();
        System.out.println("**************************************");
        PaymentFlow paymentFlow1 = new PayToMerchant();
        paymentFlow1.sendMoney();
    }
}
//output

//Friend: Validating Amount
//Friend: Debit Amount
//Friend: Calculate Amount
//Friend: Credit Amount
//**************************************
//Merchant: Validating Amount
//Merchant: Debit Amount
//Merchant: Calculate Amount
//Merchant: Credit Amount