package com.example.design_patterns.Structural.Adapter.MediaPlayerSystem;

//Adaptee

public class Mp3Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    public void playMp3(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }
}
