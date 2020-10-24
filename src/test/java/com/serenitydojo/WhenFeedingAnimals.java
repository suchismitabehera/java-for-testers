package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingAnimals {

    @Test
    public void should_feed_cat_tuna(){
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Cat", false);
        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void should_feed_dog_dogFood(){
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Dog", false);
        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void should_feed_hamster_cabbage(){
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Hamster", false);
        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void should_feed_premium_cat_salmon(){
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Cat", true);
        Assert.assertEquals("Salmon", food);
    }
}
