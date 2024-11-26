package com.example.design_patterns.Creational.Singleton.CacheManager;

public class CacheManagerDemo {
    public static void main(String[] args) {
        CacheManager cache1 = CacheManager.getInstance();
        CacheManager cache2 = CacheManager.getInstance();

        cache1.put("username", "john_doe");

        System.out.println(cache2.get("username")); // john_doe
        System.out.println(cache1 == cache2); // true (same instance)
    }
}
