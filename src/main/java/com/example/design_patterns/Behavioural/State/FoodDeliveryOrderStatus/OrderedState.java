package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class OrderedState implements OrderState {
    public void showStatus() {
        System.out.println("Order placed. Waiting to be prepared.");
    }
}
