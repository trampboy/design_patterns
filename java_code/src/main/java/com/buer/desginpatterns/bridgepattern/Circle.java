package com.buer.desginpatterns.bridgepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */
public class Circle extends Shape {
    public Circle(Green green) {
        super(green);
    }

    @Override
    String getDescription() {
        return "圆形";
    }

    @Override
    String getColor() {
        return color.getColor();
    }
}
