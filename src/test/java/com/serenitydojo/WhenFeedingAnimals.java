package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingAnimals {

    @Test
    public void should_feed_cat_tuna(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, false);
        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void should_feed_dog_dogFood(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, false);
        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void should_feed_hamster_cabbage(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, false);
        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void should_feed_premium_cat_salmon(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, true);
        Assert.assertEquals(SALMON, food);
    }
}
