package com.example.design_patterns.Behavioural.Template.Beverages;

public abstract class Beverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();
}
