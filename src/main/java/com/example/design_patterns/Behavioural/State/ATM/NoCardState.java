package com.example.design_patterns.Behavioural.State.ATM;

public class NoCardState implements ATMState {
    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("Card Inserted");
        atmMachine.setATMState(atmMachine.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("No card to eject");
    }

    public void enterPin(int pin) {
        System.out.println("Insert a card first");
    }

    public void withdrawCash(int amount) {
        System.out.println("Insert a card first");
    }
}
