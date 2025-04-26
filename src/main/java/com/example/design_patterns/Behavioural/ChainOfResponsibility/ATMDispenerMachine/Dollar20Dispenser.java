package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class Dollar20Dispenser extends DispenseChain {

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " $20 note");
            if(remainder != 0 && nextChain != null){
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
