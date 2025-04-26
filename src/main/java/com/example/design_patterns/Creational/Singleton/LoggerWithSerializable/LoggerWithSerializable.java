package com.example.design_patterns.Creational.Singleton.LoggerWithSerializable;

import java.io.Serializable;

public class LoggerWithSerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    // Private static instance
    private static LoggerWithSerializable instance = null;

    // Private constructor to prevent instantiation
    private LoggerWithSerializable() {
        // Initialize logger configurations here
        System.out.println("LoggerWithSerializable initialized.");
    }

    // Public method to provide access to the instance
    public static LoggerWithSerializable getInstance() {
        if (instance == null) { // Lazy initialization
            instance = new LoggerWithSerializable();
        }
        return instance;
    }

    // Example logging methods
    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public void logError(String message) {
        System.err.println("ERROR: " + message);
    }

    // Implement readResolve to preserve Singleton property during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
