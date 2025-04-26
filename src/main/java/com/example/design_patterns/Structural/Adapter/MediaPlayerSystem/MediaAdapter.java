package com.example.design_patterns.Structural.Adapter.MediaPlayerSystem;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        }
        else if (audioType.equalsIgnoreCase("mp3")){
            advancedMusicPlayer = new Mp3Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp3")){
            advancedMusicPlayer.playMp3(fileName);
        }
    }
}
