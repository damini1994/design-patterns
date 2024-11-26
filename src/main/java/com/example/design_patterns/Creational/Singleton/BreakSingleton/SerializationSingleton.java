package com.example.design_patterns.Creational.Singleton.BreakSingleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private static SerializationSingleton instance = null;
    private SerializationSingleton(){}

    public static SerializationSingleton getInstance() {
        if (instance == null) {
            instance = new SerializationSingleton();
        }
        return instance;
    }
    // fix singleton
    protected Object readResolve(){
        return instance;
    }
}
