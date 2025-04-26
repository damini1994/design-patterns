package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

public class Dollar100Dispenser extends DispenseChain{

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 100) {
            int num = currency.getAmount() / 100;
            int remainder = currency.getAmount() % 100;
            System.out.println("Dispensing " + num + " $100 note");
            if(remainder != 0 && nextChain != null){
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
