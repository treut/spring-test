package ru.treut.spr1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.treut.spr1")
@PropertySource("classpath:data.properties")
public class Config {


//    @Bean
//    public CMusic cMusic(){
//        return new CMusic();
//    }
//    @Bean
//    public Player player(){
//        return new Player(1param, cMusic());
//    }

}
