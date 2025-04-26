package com.example.design_patterns.Creational.Builder.ComputerBuilder.FirstWay;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // Building a Gaming Computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.setBuilder(gamingBuilder);
        director.constructComputer();
        Computer gamingPC = gamingBuilder.getComputer();
        gamingPC.displaySpecs();

        System.out.println("---------------------------");

        // Building an Office Computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.setBuilder(officeBuilder);
        director.constructComputer();
        Computer officePC = officeBuilder.getComputer();
        officePC.displaySpecs();
    }
}

//OUTPUT

//Computer Specifications:
//CPU: Intel Core i9
//GPU: NVIDIA RTX 3080
//RAM: 32GB
//Storage: 2000GB
//Peripherals: Mechanical Keyboard, Gaming Mouse, RGB Monitor
//---------------------------
//Computer Specifications:
//CPU: Intel Core i5
//GPU: Integrated Graphics
//RAM: 16GB
//Storage: 512GB
//Peripherals: Standard Keyboard, Office Mouse, LED Monitor