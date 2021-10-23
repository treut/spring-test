package ru.treut.spr1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        AnnotationConfigApplicationContext

//        Music rm=context.getBean("mBean", Music.class);

//        System.out.println(rm.getSong());


//        Music mb = context.getBean("mBean", Music.class);
//        Player mp=new Player(mb);

//        Player mp=context.getBean("player", Player.class);
//        mp.playMusic();
//
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

        Player pp=context.getBean("player", Player.class);
        pp.playMusic();
        System.out.println(pp.getName());
        System.out.println(pp.getVolume());
        context.close();

    }
}
