package com.example.design_patterns.Creational.Singleton.DatabaseConnectionPool;

public class DatabaseConnectionPoolDemo {
    public static void main(String[] args) {
        DatabaseConnectionPool pool1 = DatabaseConnectionPool.getInstance();
        DatabaseConnectionPool pool2 = DatabaseConnectionPool.getInstance();

        pool1.connect();

        System.out.println(pool1 == pool2); // true (same instance)
    }
}
