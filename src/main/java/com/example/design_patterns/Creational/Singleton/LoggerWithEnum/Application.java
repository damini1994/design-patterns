package com.example.design_patterns.Creational.Singleton.LoggerWithEnum;

public class Application {
    public static void main(String[] args) {
        // Accessing the Singleton Logger instance
        LoggerEnum.INSTANCE.logInfo("Application started.");
        LoggerEnum.INSTANCE.logError("An error occurred.");

        LoggerEnum logger1 = LoggerEnum.INSTANCE;
        LoggerEnum logger2 = LoggerEnum.INSTANCE;
        System.out.println("Logger1 and Logger2 are the same instance: " + (logger1 == logger2));
    }
}
