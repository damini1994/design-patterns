package com.example.design_patterns.Behavioural.State.TrafficSignal;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight(TrafficLightState initialState) {
        this.currentState = initialState;
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void change() {
        currentState.changeLight(this);
    }
}
