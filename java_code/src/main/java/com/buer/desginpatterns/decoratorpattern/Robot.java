package com.buer.desginpatterns.decoratorpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
    }

    @Override
    public void move() {
        transform.move();
        System.out.println("add feature robot move");
    }
}
