package com.example.design_patterns.Creational.Builder.HouseBuilder;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .foundation("Concrete")
                .structure("Wood")
                .roof("Tiles")
                .garage(true)
                .swimmingPool(false)
                .garden(true)
                .build();

        System.out.println("House built with: " + house);
    }
}
