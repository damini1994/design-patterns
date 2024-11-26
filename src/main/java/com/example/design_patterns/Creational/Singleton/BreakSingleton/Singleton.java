package com.example.design_patterns.Creational.Singleton.BreakSingleton;

public class Singleton implements Cloneable {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    // fix for singleton

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this Singleton is not allowed");
//        return INSTANCE;
    }
}
