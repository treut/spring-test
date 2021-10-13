package ru.treut.spr1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Music mb = context.getBean("mBean", Music.class);

        Player mp=new Player(mb);

        mp.playMusic();

        context.close();
    }
}
