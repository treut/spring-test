package ru.treut.spr1;

public class RMusic implements Music{

    private RMusic(){}

    public static RMusic getRMusic(){
        return new RMusic();
    }

    public void inita(){
        System.out.println("Initialization");
    }

    public void destro(){
        System.out.println("Destroyed");
    }

    public String getSong(){
        return "Rock";
    }
}
