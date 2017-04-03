package com.buer.desginpatterns.builderpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(new SubMealBuilderA());
        System.out.println(waiter.construct().getDrink());
        System.out.println(waiter.construct().getFood());

        waiter.setMealBuilder(new SubMealBuilderB());
        System.out.println(waiter.construct().getDrink());
        System.out.println(waiter.construct().getFood());
    }
}
