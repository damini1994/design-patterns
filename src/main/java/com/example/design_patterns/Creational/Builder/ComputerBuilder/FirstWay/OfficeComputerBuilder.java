package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i5");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Integrated Graphics");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(16);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(512); //512 GB
    }

    @Override
    public void buildPeripherals() {
        computer.setPeripherals("Standard Keyboard, Office Mouse, LED Monitor");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
