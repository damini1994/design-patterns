package com.example.design_patterns.Behavioural.State.ATM;

public class NoCashState implements ATMState {
    private ATMMachine atmMachine;

    public NoCashState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("ATM out of service");
    }

    public void ejectCard() {
        System.out.println("No card to eject");
    }

    public void enterPin(int pin) {
        System.out.println("ATM out of service");
    }

    public void withdrawCash(int amount) {
        System.out.println("ATM out of service");
    }
}
