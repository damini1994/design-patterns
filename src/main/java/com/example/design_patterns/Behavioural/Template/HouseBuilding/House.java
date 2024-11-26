package com.example.design_patterns.Behavioural.Template.HouseBuilding;

public abstract class House {

    // Template method
    public final void buildHouse() {
        layFoundation();
        buildWalls();
        addRoof();
        paintHouse();
        addUtilities();
    }

    private void layFoundation() {
        System.out.println("Laying the foundation...");
    }

    protected abstract void buildWalls();

    protected abstract void addRoof();

    protected void paintHouse() {
        System.out.println("Default painting applied.");
    }

    protected void addUtilities() {
        System.out.println("Adding basic utilities.");
    }
}
