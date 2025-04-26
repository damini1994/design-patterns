package com.example.design_patterns.Structural.Adapter.MediaPlayerSystem;

//Media Player system where the client expects to play different media formats,
//but the existing system can only play MP4 files. We will use the Adapter pattern
//to enable playing other formats like VLC and MP3

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3"); // Directly supported
        audioPlayer.play("vlc", "movie1.vlc"); // Adapted
        audioPlayer.play("mp4", "video1.mp4"); // Adapted
        audioPlayer.play("avi", "video2.avi"); // Not supported
    }
}
