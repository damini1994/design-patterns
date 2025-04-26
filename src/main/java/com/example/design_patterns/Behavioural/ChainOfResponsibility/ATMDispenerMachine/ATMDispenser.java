package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class ATMDispenser {
    DispenseChain c1;

    public ATMDispenser(){
        this.c1 = new Dollar100Dispenser();
        DispenseChain c2 = new Dollar50Dispenser();
        DispenseChain c3 = new Dollar20Dispenser();
        DispenseChain c4 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }

    public static void main(String[] args) {
        ATMDispenser atmDispenser = new ATMDispenser();
        int amount = 380;

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
        } else {
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
