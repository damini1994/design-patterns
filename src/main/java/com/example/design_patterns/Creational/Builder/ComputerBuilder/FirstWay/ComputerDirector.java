package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public class ComputerDirector {

    private ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildPeripherals();
    }
}
