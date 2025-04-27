package com.example.design_patterns.Behavioural.State.TrafficSignal;

public class YellowLightState implements TrafficLightState {
    public void changeLight(TrafficLight context) {
        System.out.println("Yellow Light → Changing to Green");
        context.setState(new GreenLightState());
    }
}
