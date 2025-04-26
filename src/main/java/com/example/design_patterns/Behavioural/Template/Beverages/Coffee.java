package com.example.design_patterns.Behavioural.Template.Beverages;

public class Coffee extends Beverage{

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
