package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
