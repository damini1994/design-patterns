package com.example.design_patterns.Structural.Facade.HomeTheaterSystem;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SurroundSoundSystem soundSystem;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SurroundSoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}
