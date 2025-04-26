package com.example.design_patterns.Behavioural.ChainOfResponsibility.ATMDispenerMachine;

abstract public class DispenseChain {

    protected DispenseChain nextChain;

    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void dispense(Currency currency);
}
