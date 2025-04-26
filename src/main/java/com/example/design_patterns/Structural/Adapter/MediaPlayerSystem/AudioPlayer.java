package com.example.design_patterns.Structural.Adapter.MediaPlayerSystem;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp4")){
            System.out.println("Playing mp4 file. Name: " + fileName);
        }
        // MediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp3")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
