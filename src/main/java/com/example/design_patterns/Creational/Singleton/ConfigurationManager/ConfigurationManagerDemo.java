package com.example.design_patterns.Creational.Singleton.ConfigurationManager;

public class ConfigurationManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println(config1.getProperty("app.name"));
        System.out.println(config1 == config2); // true (same instance)
    }
}
