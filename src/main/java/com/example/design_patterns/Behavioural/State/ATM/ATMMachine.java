package com.example.design_patterns.Behavioural.State.ATM;

public class ATMMachine {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState correctPinState;
    private ATMState noCashState;

    private ATMState currentState;
    private int cashInMachine;

    public ATMMachine(int initialCash) {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        correctPinState = new CorrectPinState(this);
        noCashState = new NoCashState(this);

        this.cashInMachine = initialCash;
        if (initialCash > 0) {
            currentState = noCardState;
        } else {
            currentState = noCashState;
        }
    }

    public void setATMState(ATMState newState) {
        this.currentState = newState;
    }

    public void setCashInMachine(int cash) {
        this.cashInMachine = cash;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    // Delegating methods
    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

    // Getters for states
    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getCorrectPinState() {
        return correctPinState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }
}
