package com.example.design_patterns.Structural.Facade.ComputerStartupSystem;

class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory: Loading data at position " + position);
    }
}