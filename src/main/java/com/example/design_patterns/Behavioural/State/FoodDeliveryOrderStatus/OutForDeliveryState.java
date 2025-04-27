package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class OutForDeliveryState implements OrderState {
    public void showStatus() {
        System.out.println("Your order is out for delivery.");
    }
}
