package com.example.design_patterns.Creational.Singleton.DBConnectionPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPool {
    private static volatile DBConnectionPool instance = null;
    private List<String> availableConnections;
    private List<String> usedConnections;
    private static final int MAX_CONNECTIONS = 5;

    // Private constructor to prevent instantiation
    private DBConnectionPool() {
        availableConnections = new ArrayList<>();
        usedConnections = new ArrayList<>();
        // Initialize the pool with dummy connection identifiers
        for (int i = 1; i <= MAX_CONNECTIONS; i++) {
            availableConnections.add("Connection-" + i);
        }
    }

    // Public method to provide access to the instance
    public static DBConnectionPool getInstance() {
        if (instance == null) {
            synchronized (DBConnectionPool.class) {
                if (instance == null) {
                    instance = new DBConnectionPool();
                }
            }
        }
        return instance;
    }

    // Method to acquire a connection
    public synchronized String acquireConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("No available connections. Please wait.");
            return null;
        }
        String connection = availableConnections.remove(availableConnections.size() - 1);
        usedConnections.add(connection);
        System.out.println(connection + " acquired.");
        return connection;
    }

    // Method to release a connection
    public synchronized void releaseConnection(String connection) {
        if (usedConnections.remove(connection)) {
            availableConnections.add(connection);
            System.out.println(connection + " released.");
        } else {
            System.out.println("Invalid connection: " + connection);
        }
    }

    // Method to display current pool status
    public void poolStatus() {
        System.out.println("Available Connections: " + availableConnections);
        System.out.println("Used Connections: " + usedConnections);
    }
}
