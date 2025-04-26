package com.example.design_patterns.Creational.Singleton.LoggerWithEnum;

public enum LoggerEnum {
    INSTANCE;

    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public void logError(String message) {
        System.err.println("ERROR: " + message);
    }
}
