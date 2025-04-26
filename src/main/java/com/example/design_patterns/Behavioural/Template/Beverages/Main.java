package com.example.design_patterns.Behavioural.Template.Beverages;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Tea();
        beverage.prepareRecipe();

        System.out.println("************************************");

        Beverage beverage1 = new Coffee();
        beverage1.prepareRecipe();
    }
}

//OUTPUT

//Boiling Water
//Steeping the tea
//Pouring into cup
//Adding lemon
//************************************
//Boiling Water
//Dripping coffee through filter
//Pouring into cup
//Adding Sugar and Milk