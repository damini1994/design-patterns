package com.example.design_patterns.Creational.Singleton.BreakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();

        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();

        System.out.println("Reflected hashcode singleton "+lazySingleton.hashCode());
        System.out.println("Singleton instance : "+instance.hashCode());

        //Solution to this is go to enum
        Constructor[] enumConstructors = EnumSingleton.class.getDeclaredConstructors();
        enumConstructors[0].setAccessible(true);
        EnumSingleton instance1 = (EnumSingleton) enumConstructors[0].newInstance();

    }
}
