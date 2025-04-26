package com.example.design_patterns.Behavioural.ChainOfResponsibility.Logger;

public abstract class LoggerHandler {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected LoggerHandler nextLogger;

    public void setNextLogger(LoggerHandler nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void logMessage(int level, String message);
}
