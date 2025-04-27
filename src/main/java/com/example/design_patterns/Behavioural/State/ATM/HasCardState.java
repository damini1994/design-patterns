package com.example.design_patterns.Behavioural.State.ATM;

public class HasCardState implements ATMState {
    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("Card already inserted");
    }

    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN entered");
            atmMachine.setATMState(atmMachine.getCorrectPinState());
        } else {
            System.out.println("Incorrect PIN. Try again.");
        }
    }

    public void withdrawCash(int amount) {
        System.out.println("Enter PIN first");
    }
}
