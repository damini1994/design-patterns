package com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem;

import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable.Subject;
import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observable.WeatherData;
import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observer.CurrentConditionDisplay;
import com.example.design_patterns.Behavioural.Observer.WeatherMonitoringSystem.Observer.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
