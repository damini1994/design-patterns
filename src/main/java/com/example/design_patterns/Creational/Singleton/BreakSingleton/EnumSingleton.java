package com.example.design_patterns.Creational.Singleton.BreakSingleton;

public enum EnumSingleton {
    INSTANCE;
    public void doSomething () {
        System.out.println("Enum Instance");
    }
}
