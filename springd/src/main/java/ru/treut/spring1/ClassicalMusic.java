package ru.treut.spring1;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public String getSong(){
        return "meine musica classic";
    }

    public void doInit(){
        System.out.println("init");
    }

    public void doDestroy(){
        System.out.println("destroyy");
    }
}
