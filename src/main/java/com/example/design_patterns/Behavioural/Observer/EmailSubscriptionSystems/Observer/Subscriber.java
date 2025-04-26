package com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String email) {
        System.out.println(name + " received email: " + email);
    }
}
