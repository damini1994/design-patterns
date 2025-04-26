package com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observable;

import com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
