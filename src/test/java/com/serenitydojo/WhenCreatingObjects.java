package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void write_hello_world()
    {

        HelloWorld test = new HelloWorld();
        test.printHelloWorld();
    }

    @Test
    public void create_a_hamster(){
        Hamster rusty = new Hamster("Rusty", 1, "Wheel");
        Assert.assertEquals(rusty.getName(),"Rusty");
        Assert.assertEquals(rusty.getAge(),1);
        Assert.assertEquals(rusty.getFavouriteGame(),"Wheel");
    }

    @Test
    public void creating_a_cat(){
        Cat mini = new Cat("Mini", 3, "Milk");
        System.out.println(mini.getName() + " likes to drink " + mini.getFavoriteFood());
    }

    @Test
    public void creating_a_dog(){
        Dog fatso = new Dog("Fatso", 4, "Bone");
        System.out.println(fatso.getName() + " likes to play with " + fatso.getFavoriteToy());
    }

    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat("Felix", 4, "Tuna");
        System.out.println("Felix goes " + felix.makeNoise());
    }

    @Test
    public void dog_makes_noise(){
        Dog raldo = new Dog("Raldo", 4, "Ball");
        System.out.println("Raldo goes " + raldo.makeNoise());
    }

    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix", 3, "Tuna");
        Pet fido = new Dog("Fido", 3, "Bone");
        Pet rusty = new Hamster("Rusty", 1, "Wheel");

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
    }

    @Test public void pets_can_play(){
        Pet felix = new Cat("Felix", 3, "Tuna");
        Pet fido = new Dog("Fido", 3, "Bone");
        Pet rusty = new Hamster("Rusty", 1, "Wheel");

        System.out.println("Felix " + felix.play());
        System.out.println("Fido " + fido.play());
        System.out.println("Rusty " + rusty.play());
    }



}
