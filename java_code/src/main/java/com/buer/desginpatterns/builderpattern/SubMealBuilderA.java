package com.buer.desginpatterns.builderpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class SubMealBuilderA extends MealBuilder {

    @Override
    public void buildDrink() {
        getMeal().setDrink("DrinkA");
    }

    @Override
    public void buildFood() {
        getMeal().setFood("FoodA");
    }
}
