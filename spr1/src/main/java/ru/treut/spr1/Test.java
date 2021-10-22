package ru.treut.spr1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        RMusic rm=context.getBean("mBean", RMusic.class);

        System.out.println(rm.getSong());


//        Music mb = context.getBean("mBean", Music.class);
//        Player mp=new Player(mb);

//        Player mp=context.getBean("player", Player.class);
//        mp.playMusic();
//
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

        context.close();
    }
}
