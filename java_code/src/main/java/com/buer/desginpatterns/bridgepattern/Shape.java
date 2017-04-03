package com.buer.desginpatterns.bridgepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract String getDescription();
    abstract String getColor();
}
