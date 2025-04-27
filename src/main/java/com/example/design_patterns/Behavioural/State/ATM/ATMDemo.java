package com.example.design_patterns.Behavioural.State.ATM;

public class ATMDemo {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(2000);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(500);

        System.out.println("\n--- Next Customer ---\n");

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(1600);

        System.out.println("\n--- ATM Cash Balance ---");
        System.out.println("Cash remaining: $" + atmMachine.getCashInMachine());
    }
}
//OUTPUT


//Card Inserted
//Correct PIN entered
//Withdrawing $500
//Please take your card
//
//--- Next Customer ---
//
//Card Inserted
//Correct PIN entered
//Withdrawing $1600
//ATM out of service
//
//--- ATM Cash Balance ---
//Cash remaining: $-100
