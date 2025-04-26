package com.example.design_patterns.Creational.Singleton.DBConnectionPool;

public class Application {
    public static void main(String[] args) {
        DBConnectionPool pool = DBConnectionPool.getInstance();

        // Simulate acquiring connections
        String conn1 = pool.acquireConnection();
        String conn2 = pool.acquireConnection();
        String conn3 = pool.acquireConnection();
        String conn4 = pool.acquireConnection();
        String conn5 = pool.acquireConnection();
        String conn6 = pool.acquireConnection(); // Should indicate no available connections

        // Display pool status
        pool.poolStatus();

        // Release some connections
        pool.releaseConnection(conn3);
        pool.releaseConnection(conn5);
        pool.releaseConnection("Invalid-Connection"); // Should indicate invalid connection

        // Display pool status again
        pool.poolStatus();

        // Attempt to acquire again
        String conn7 = pool.acquireConnection();
        String conn8 = pool.acquireConnection();

        // Final pool status
        pool.poolStatus();
    }
}
