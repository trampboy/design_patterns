package com.buer.desginpatterns.builderpattern;

/**
 * 建造者模式
 * Created by YanMingDao on 03/04/2017.
 */

public class KFCWaiter {
    private MealBuilder md;

    public Meal construct() {
        md.buildDrink();
        md.buildFood();
        return md.getMeal();
    }

    public void setMealBuilder(MealBuilder md) {
        this.md = md;
    }
}
