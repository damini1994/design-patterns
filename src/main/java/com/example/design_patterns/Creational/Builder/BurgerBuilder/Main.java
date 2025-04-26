package com.example.design_patterns.Creational.Builder.BurgerBuilder;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .bun("Sesame Seed Bun")
                .patty("Veg Patty")
                .cheese("Cheddar Cheese")
                .sauce("Ketchup")
                .lettuce(true)
                .bacon(false)
                .build();

        System.out.println(burger);
    }
}
