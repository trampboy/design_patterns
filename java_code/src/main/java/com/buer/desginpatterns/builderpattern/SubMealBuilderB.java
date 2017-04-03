package com.buer.desginpatterns.builderpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class SubMealBuilderB extends MealBuilder {
    @Override
    void buildDrink() {
        getMeal().setDrink("DrinkB");
    }

    @Override
    void buildFood() {
        getMeal().setFood("FoodB");
    }
}
