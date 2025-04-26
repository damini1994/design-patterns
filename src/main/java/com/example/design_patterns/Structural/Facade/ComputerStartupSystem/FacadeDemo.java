package com.example.design_patterns.Structural.Facade.ComputerStartupSystem;

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}