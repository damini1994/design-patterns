package com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observable;

import com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MailingList implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    private String latestEmail;

    @Override
    public void registerObserver(Observer o) { subscribers.add(o); }
    @Override
    public void removeObserver(Observer o) { subscribers.remove(o); }
    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) { o.update(latestEmail); }
    }

    public void newEmail(String email) {
        this.latestEmail = email;
        notifyObservers();
    }
}
