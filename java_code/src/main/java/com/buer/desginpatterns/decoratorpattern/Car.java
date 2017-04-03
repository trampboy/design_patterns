package com.buer.desginpatterns.decoratorpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Car implements Transform {
    @Override
    public void move() {
        System.out.println("Car move");
    }
}
