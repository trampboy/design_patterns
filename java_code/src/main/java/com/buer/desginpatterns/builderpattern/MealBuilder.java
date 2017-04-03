package com.buer.desginpatterns.builderpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */
public abstract class MealBuilder {
    Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    Meal getMeal() {
        return meal;
    }

    abstract void buildDrink();
    abstract void buildFood();
}
