package com.buer.desginpatterns.flyweightpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight");
    }
}
