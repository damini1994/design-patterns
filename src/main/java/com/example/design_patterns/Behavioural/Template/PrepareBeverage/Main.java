package com.example.design_patterns.Behavioural.Template.PrepareBeverage;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("******************************");

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
//Output

//Boiling water
//Steeping the tea
//Pouring into cup
//Adding Lemon
//******************************
//Boiling water
//Dripping Coffee through filter
//Pouring into cup
//Adding Sugar and Milk