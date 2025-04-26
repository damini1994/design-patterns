package com.example.design_patterns.Behavioural.ChainOfResponsibility.Logger;

public class InfoLogger extends LoggerHandler {

    @Override
    public void logMessage(int level, String message) {
        if (level == LoggerHandler.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
