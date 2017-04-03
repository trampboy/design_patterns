package com.buer.desginpatterns.decoratorpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public abstract class Changer implements Transform {
    protected Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }
}
