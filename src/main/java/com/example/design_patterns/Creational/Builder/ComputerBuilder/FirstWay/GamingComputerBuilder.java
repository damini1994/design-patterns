package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i9");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("NVIDIA RTX 3080");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(32);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(2000); // 2TB
    }

    @Override
    public void buildPeripherals() {
        computer.setPeripherals("Mechanical Keyboard, Gaming Mouse, RGB Monitor");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
