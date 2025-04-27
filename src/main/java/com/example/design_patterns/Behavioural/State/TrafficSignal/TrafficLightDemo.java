package com.example.design_patterns.Behavioural.State.TrafficSignal;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(new RedLightState());

        light.change(); // Red → Yellow
        light.change(); // Yellow → Green
        light.change(); // Green → Red
    }
}
