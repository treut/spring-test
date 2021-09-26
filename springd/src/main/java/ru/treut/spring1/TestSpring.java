package ru.treut.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


//@Controller
public class TestSpring {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //TestBean testBean = context.getBean("testBean", TestBean.class);

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer mp = new MusicPlayer(music);


        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        mp.playMusic();


        //while(true){
            /*try{
                Thread.sleep(100);
                System.out.println(testBean.getName());
            }
            catch(Exception e){}*/
        //}
        context.close();
    }
}
