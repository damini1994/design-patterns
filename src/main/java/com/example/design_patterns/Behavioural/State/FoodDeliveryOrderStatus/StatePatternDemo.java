package com.example.design_patterns.Behavioural.State.FoodDeliveryOrderStatus;

public class StatePatternDemo {

//    Your food order goes through several states:
//    Ordered
//    Preparing
//    Out for Delivery
//    Delivered
//
//    Each state has different behavior (message shown to the user).

    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setState(new OrderedState());
        order.showStatus();  // Order placed.

        order.setState(new PreparingState());
        order.showStatus();  // Food is being prepared.

        order.setState(new OutForDeliveryState());
        order.showStatus();  // Out for delivery.

        order.setState(new DeliveredState());
        order.showStatus();  // Delivered.
    }
}
