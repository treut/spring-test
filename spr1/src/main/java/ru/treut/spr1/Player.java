package ru.treut.spr1;

public class Player {
    private Music music;

    // IOC
    public Player(Music music){
        this.music=music;
    }

    public Player(){}

    public void setMusic(Music music){
        this.music=music;
    }


    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
