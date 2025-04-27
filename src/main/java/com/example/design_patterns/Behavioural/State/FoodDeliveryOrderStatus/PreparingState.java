package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class PreparingState implements OrderState {
    public void showStatus() {
        System.out.println("Your food is being prepared.");
    }
}
