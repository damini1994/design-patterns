package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class DeliveredState implements OrderState {
    public void showStatus() {
        System.out.println("Order delivered. Enjoy your meal!");
    }
}
