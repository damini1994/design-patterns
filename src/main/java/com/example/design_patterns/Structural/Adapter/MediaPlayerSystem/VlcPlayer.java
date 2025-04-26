package com.example.design_patterns.Structural.Adapter.MediaPlayerSystem;

//Adaptee

public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp3(String fileName) {
        //do nothing
    }
}
