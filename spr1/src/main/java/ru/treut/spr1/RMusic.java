package ru.treut.spr1;

public class RMusic implements Music{

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
