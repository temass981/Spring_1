package org.example;


import org.example.beans.TheFilm;
import org.example.beans.TheFirstSong;
import org.example.beans.TheGame;
import org.example.beans.TheSecondSong;
import org.example.configs.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Action {
  ApplicationContext context = new AnnotationConfigApplicationContext("org.example.beans");
  ApplicationContext myconfig = new AnnotationConfigApplicationContext(MyConfig.class);
  public void run (){
    System.out.println("Введите число 1, если хотите послушать музыку, введите число 2 если хотите посмотреть фильм или число 3 чтобы поиграть в игру");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    switch (number){
      case(1): listenToMusic(); break;
      case(2): watchAMovie(); break;
      case(3): playTheGame(); break;
    }
  }
  public void listenToMusic(){
    TheFirstSong theFirstSong = context.getBean(TheFirstSong.class);
    TheSecondSong theSecondSong = (TheSecondSong) context.getBean("theSecondSong");
    System.out.println(theFirstSong);
    System.out.println(theSecondSong);
  }
  public void watchAMovie(){
    TheFilm theFilm = (TheFilm) myconfig.getBean("getTheFilm");
    System.out.println(theFilm);
  }
  public void playTheGame(){
    TheGame theGame = myconfig.getBean("TheGame", TheGame.class);
    System.out.println(theGame);
  }
}
