package com.example.design_patterns.Behavioural.ChainOfResponsibility.Logger;

public class ErrorLogger extends LoggerHandler {

    @Override
    public void logMessage(int level, String message) {
        if (level == LoggerHandler.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
