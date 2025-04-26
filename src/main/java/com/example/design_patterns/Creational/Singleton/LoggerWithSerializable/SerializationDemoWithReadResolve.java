package com.example.design_patterns.Creational.Singleton.LoggerWithSerializable;

import java.io.*;

public class SerializationDemoWithReadResolve {
    public static void main(String[] args) {
        try {
            LoggerWithSerializable logger1 = LoggerWithSerializable.getInstance();
            logger1.logInfo("Logging from logger1.");

            // Serialize the singleton instance to a file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("LoggerWithSerializable.ser"));
            out.writeObject(logger1);
            out.close();

            // Deserialize the singleton instance from the file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("LoggerWithSerializable.ser"));
            LoggerWithSerializable logger2 = (LoggerWithSerializable) in.readObject();
            in.close();

            logger2.logInfo("Logging from logger2.");

            // Check if both instances are the same
            System.out.println("Logger1 hashCode: " + logger1.hashCode());
            System.out.println("Logger2 hashCode: " + logger2.hashCode());
            System.out.println("Are both loggers same instance? " + (logger1 == logger2));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
