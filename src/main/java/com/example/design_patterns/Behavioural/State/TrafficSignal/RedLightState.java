package com.example.design_patterns.Behavioural.State.TrafficSignal;

public class RedLightState implements TrafficLightState {
    public void changeLight(TrafficLight context) {
        System.out.println("Red Light → Changing to Yellow");
        context.setState(new YellowLightState());
    }
}
