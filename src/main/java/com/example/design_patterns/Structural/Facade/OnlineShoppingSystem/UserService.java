package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class UserService {

    public void login(String username, String password) {
        System.out.println("User " + username + " logged in.");
    }

    public void register(String username, String email, String password) {
        System.out.println("User " + username + " registered with email " + email);
    }
}
