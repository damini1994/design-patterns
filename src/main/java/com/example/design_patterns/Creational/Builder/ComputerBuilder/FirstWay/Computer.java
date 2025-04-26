package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private String peripherals;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setPeripherals(String peripherals) {
        this.peripherals = peripherals;
    }

    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + CPU);
        System.out.println("GPU: " + GPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Peripherals: " + peripherals);
    }
}
