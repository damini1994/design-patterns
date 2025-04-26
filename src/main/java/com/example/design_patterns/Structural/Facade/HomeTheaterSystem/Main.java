package com.example.design_patterns.Structural.Facade.HomeTheaterSystem;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, screen);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
