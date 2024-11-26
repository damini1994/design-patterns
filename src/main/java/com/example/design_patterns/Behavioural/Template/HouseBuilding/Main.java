package com.example.design_patterns.Behavioural.Template.HouseBuilding;

public class Main {
    public static void main(String[] args) {
        System.out.println("Building a Wooden House:");
        House woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println();

        System.out.println("\nBuilding a Glass House:");
        House glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
//Output
//
//Building a Wooden House:
//Laying the foundation...
//Building wooden walls.
//Adding a wooden roof.
//Applying wood polish.
//Adding basic utilities.
//
//
//Building a Glass House:
//Laying the foundation...
//Building glass walls.
//Adding a transparent glass roof.
//Default painting applied.
//Adding solar panels and modern utilities.
