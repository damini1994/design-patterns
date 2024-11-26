package com.example.design_patterns.Behavioural.Template.PrepareBeverage;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
