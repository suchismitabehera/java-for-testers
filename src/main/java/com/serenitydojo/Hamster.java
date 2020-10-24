package com.serenitydojo;

public class Hamster extends Pet {
       private String favouriteGame;

       public Hamster(String name, int age, String game){
           super(name,age);
           this.favouriteGame = game;
       }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }

    @Override
    public  String play(){
           return "runs in wheel";
    }
}
