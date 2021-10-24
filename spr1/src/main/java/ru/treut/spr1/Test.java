package ru.treut.spr1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Player pp=context.getBean("player", Player.class);
        pp.playMusic();
        System.out.println(pp.getName());
        System.out.println(pp.getVolume());
        context.close();

    }
}
