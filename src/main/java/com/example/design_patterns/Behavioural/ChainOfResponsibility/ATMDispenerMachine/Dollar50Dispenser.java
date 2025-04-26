package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class Dollar50Dispenser extends DispenseChain{

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " $50 note");
            if(remainder != 0 && nextChain != null){
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
