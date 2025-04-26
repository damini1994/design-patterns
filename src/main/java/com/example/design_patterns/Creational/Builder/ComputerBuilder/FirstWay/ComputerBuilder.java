package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public interface ComputerBuilder {
    void buildCPU();
    void buildGPU();
    void buildRAM();
    void buildStorage();
    void buildPeripherals();
    Computer getComputer();
}
