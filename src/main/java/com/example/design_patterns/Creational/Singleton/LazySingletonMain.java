package com.example.design_patterns.Creational.Singleton;

public class LazySingletonMain {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        System.out.println(lazySingleton == lazySingleton1);
    }
}
