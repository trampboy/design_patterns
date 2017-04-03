package com.buer.desginpatterns.bridgepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "矩形";
    }

    @Override
    public String getColor() {
        return color.getColor();
    }
}
