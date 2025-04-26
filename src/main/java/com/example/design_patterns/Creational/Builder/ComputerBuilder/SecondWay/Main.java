package com.example.design_patterns.Creational.Builder.ComputerBuilder.SecondWay;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder()
                .CPU("Intel Core i9")
                .GPU("NVIDIA RTX 3080")
                .RAM(32)
                .Storage(2000)
                .Peripherals("Mechanical Keyboard, Gaming Mouse, RGB Monitor")
                .build();

        System.out.println("Gaming Computer Spec: "+gamingComputer);

        System.out.println("*****************************************************");

        Computer officeComputer = new Computer.ComputerBuilder()
                .CPU("Intel Core i5")
                .GPU("Integrated Graphics")
                .RAM(16)
                .Storage(512)
                .Peripherals("Standard Keyboard, Office Mouse, LED Monitor")
                .build();

        System.out.println("Office Computer Spec: "+officeComputer);

    }
}

// OUTPUT

//Gaming Computer Spec: Computer{CPU='Intel Core i9', GPU='NVIDIA RTX 3080', RAM=32, storage=2000, peripherals='Mechanical Keyboard, Gaming Mouse, RGB Monitor'}
//*****************************************************
//Office Computer Spec: Computer{CPU='Intel Core i5', GPU='Integrated Graphics', RAM=16, storage=512, peripherals='Standard Keyboard, Office Mouse, LED Monitor'}