package com.example.design_patterns.Behavioural.State.ATM;

public class CorrectPinState implements ATMState {
    private ATMMachine atmMachine;

    public CorrectPinState(ATMMachine atmMachine) {
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
        System.out.println("PIN already entered");
    }

    public void withdrawCash(int amount) {
        if (atmMachine.getCashInMachine() >= amount) {
            System.out.println("Withdrawing $" + amount);
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - amount);

            if (atmMachine.getCashInMachine() <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            } else {
                System.out.println("Please take your card");
                atmMachine.setATMState(atmMachine.getNoCardState());
            }
        } else {
            System.out.println("Not enough cash available");
            System.out.println("Please take your card");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }
}
