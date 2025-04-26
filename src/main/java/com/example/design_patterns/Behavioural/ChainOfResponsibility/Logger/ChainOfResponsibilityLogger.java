package com.example.design_patterns.Behavioural.ChainOfResponsibility.Logger;

public class ChainOfResponsibilityLogger {
    private static LoggerHandler getChainOfLoggers() {
        LoggerHandler errorLogger = new ErrorLogger();
        LoggerHandler debugLogger = new DebugLogger();
        LoggerHandler infoLogger = new InfoLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        LoggerHandler loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LoggerHandler.INFO, "This is an informational message.");
        loggerChain.logMessage(LoggerHandler.DEBUG, "This is a debug message.");
        loggerChain.logMessage(LoggerHandler.ERROR, "This is an error message.");
    }
}
