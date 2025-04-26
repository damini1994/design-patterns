package com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable;

import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
