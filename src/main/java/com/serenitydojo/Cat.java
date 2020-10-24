package com.serenitydojo;

public class Cat extends Pet {
    private static final String CAT_NOISE = "Meow";
    private String favoriteFood;


    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    @Override
    public String play(){
        return "plays with string";
    }

}
