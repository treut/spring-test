package ru.treut.spr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
//    @Autowired
//    @Qualifier("CMusic")
//    private Music music;

    @Value("${player.name}")
    private String name;

    @Value("${player.volume}")
    private int volume;

    public String getName(){
        return name;
    }

    public int getVolume(){
        return volume;
    }

    private Music m1;
    private Music m2;

    @Autowired
    public Player(@Qualifier("RMusic") Music m1, @Qualifier("CMusic") Music m2){
        this.m1=m1;
        this.m2=m2;
    }



    public void playMusic(){
//        System.out.println("Playing: "+music.getSong());
        System.out.println("Playing: "+m1.getSong()+" & "+m2.getSong());
    }
}
