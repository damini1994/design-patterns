package com.example.design_patterns.Creational.Singleton.DatabaseConnectionPool;

public class DatabaseConnectionPool {

    private static DatabaseConnectionPool instance;

    private DatabaseConnectionPool() { }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}
