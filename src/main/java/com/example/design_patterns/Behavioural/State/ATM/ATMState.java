package com.example.design_patterns.Behavioural.State.ATM;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}
