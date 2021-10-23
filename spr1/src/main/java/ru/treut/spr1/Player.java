package ru.treut.spr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
//    private Music music;

    @Autowired
    private CMusic cmusic;
    @Autowired
    private RMusic rmusic;


//    @Autowired
//    public Player(CMusic cmusic, RMusic rmusic){
//        this.cmusic=cmusic;
//        this.rmusic=rmusic;
//    }



//    @Autowired
//    private Music music;

//    private String name;
//    private int volume;
//
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setVolume(int volume){
//        this.volume=volume;
//    }
//    public int getVolume(){
//        return volume;
//    }





    // IOC
//    @Autowired
//    public Player(Music music){
//        this.music=music;
//    }
//

//    @Autowired
//    public void setMusic(Music music){
//        this.music=music;
//    }






//    public Player(){}

//    public void setMusic(Music music){
//        this.music=music;
//    }


    public void playMusic(){
        System.out.println("Playing: "+cmusic.getSong());
        System.out.println("Playing: "+rmusic.getSong());
    }
}
