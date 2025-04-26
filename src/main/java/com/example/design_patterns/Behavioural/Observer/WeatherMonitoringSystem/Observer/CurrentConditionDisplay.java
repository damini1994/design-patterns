package com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observer;

import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable.Subject;
import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+"F degree and "+humidity+" % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.temperature;
        this.humidity = weatherData.humidity;
        display();
    }
}
