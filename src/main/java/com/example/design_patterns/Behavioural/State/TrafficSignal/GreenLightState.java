package com.example.design_patterns.Behavioural.State.TrafficSignal;

public class GreenLightState implements TrafficLightState {
    public void changeLight(TrafficLight context) {
        System.out.println("Green Light → Changing to Red");
        context.setState(new RedLightState());
    }
}
