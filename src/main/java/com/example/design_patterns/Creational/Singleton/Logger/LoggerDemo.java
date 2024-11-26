package com.example.design_patterns.Creational.Singleton.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");

        System.out.println(logger1 == logger2); // true (same instance)
    }
}
