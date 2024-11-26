package com.example.design_patterns.Behavioural.Template.HouseBuilding;

public class WoodenHouse extends House {

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    protected void addRoof() {
        System.out.println("Adding a wooden roof.");
    }

    @Override
    protected void paintHouse() {
        System.out.println("Applying wood polish.");
    }
}
