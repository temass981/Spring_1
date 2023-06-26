package org.example.configs;


import org.example.beans.TheFilm;
import org.example.beans.TheGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
  @Bean
  public TheFilm getTheFilm(){
    return new TheFilm("Home Alone","comedy");
  }
  @Bean("TheGame")
  public TheGame getTheGame(){
    return new TheGame("heartstone","card game");
  }
}
