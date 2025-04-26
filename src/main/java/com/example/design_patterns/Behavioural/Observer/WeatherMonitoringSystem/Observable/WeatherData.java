package com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable;

import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
