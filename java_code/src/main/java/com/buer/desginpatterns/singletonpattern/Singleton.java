package com.buer.desginpatterns.singletonpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Singleton {
    private static Singleton self;

    private Singleton() {}

    public static Singleton getInstance() {
        if (self == null) {
            self = new Singleton();
        }
        return self;
    }

    @Override
    public String toString() {
        return "Singleton";
    }
}
