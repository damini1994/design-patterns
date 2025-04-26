package com.example.design_patterns.Creational.Builder.ComputerBuilder.SecondWay;

import com.example.design_patterns.Creational.Builder.HouseBuilder.House;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private String peripherals;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.peripherals = builder.peripherals;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", peripherals='" + peripherals + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;
        private String peripherals;

        public ComputerBuilder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder RAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder Storage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder Peripherals(String peripherals) {
            this.peripherals = peripherals;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
