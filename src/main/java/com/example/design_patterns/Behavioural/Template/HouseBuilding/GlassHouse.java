package com.example.design_patterns.Behavioural.Template.HouseBuilding;

public class GlassHouse extends House {

    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls.");
    }

    @Override
    protected void addRoof() {
        System.out.println("Adding a transparent glass roof.");
    }

    @Override
    protected void addUtilities() {
        System.out.println("Adding solar panels and modern utilities.");
    }
}
