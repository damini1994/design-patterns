package com.example.design_patterns.Creational.Singleton.BreakSingleton;

public class SingletonCloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = (Singleton) instance1.clone();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2); // false
    }
}
