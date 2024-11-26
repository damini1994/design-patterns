package com.example.design_patterns.Creational.Singleton;

public class MultiThreadedSingleton {
    private static MultiThreadedSingleton instance = null;

    private MultiThreadedSingleton() {}

    public static MultiThreadedSingleton getInstance() {
        if(instance == null) {
            synchronized (MultiThreadedSingleton.class) {
                if(instance == null) {
                    instance = new MultiThreadedSingleton();
                }
            }
        }
        return instance;
    }
}
