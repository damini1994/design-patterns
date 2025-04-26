package com.example.design_patterns.Behavioural.ChainOfResponsibility.Logger;

public class DebugLogger extends LoggerHandler {

    @Override
    public void logMessage(int level, String message) {
        if (level == LoggerHandler.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
