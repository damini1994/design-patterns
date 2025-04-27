package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class OrderContext {
    private OrderState currentState;

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void showStatus() {
        if (currentState != null) {
            currentState.showStatus();
        } else {
            System.out.println("No order state defined.");
        }
    }
}
