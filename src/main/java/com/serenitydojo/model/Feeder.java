package com.serenitydojo.model;

public class Feeder {

    public String feeds(String animal, boolean isPremium){
        switch(animal){
            case ("Cat"):
                return (isPremium)?"Salmon":"Tuna";
            case ("Dog"):
                return (isPremium)?"Delux Dog Food":"Dog Food";
            case ("Hamster"):
                return (isPremium)?"Letuce":"Cabbage";
            default:
                return "No food";
        }

    }
}
