package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class Client {
    public static void main(String[] args) {
        OnlineShoppingFacade shoppingFacade = new OnlineShoppingFacade();

        shoppingFacade.placeOrder("john_doe", "password123", "P123", 2, "Credit Card");
        shoppingFacade.trackOrder("ORD123");
    }
}
