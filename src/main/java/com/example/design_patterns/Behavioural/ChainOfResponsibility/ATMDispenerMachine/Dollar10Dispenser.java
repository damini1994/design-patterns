package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class Dollar10Dispenser extends DispenseChain{

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " $10 note");
            if(remainder != 0 && nextChain != null){
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
