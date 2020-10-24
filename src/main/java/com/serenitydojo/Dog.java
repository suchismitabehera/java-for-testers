package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String toy) {
        super(name, age);
        this.favoriteToy = toy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String makeNoise() {
        return "Woof";
    }

    @Override
    public String play(){
        return "plays with bone";
    }
}
