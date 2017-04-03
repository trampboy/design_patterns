package com.buer.desginpatterns.adapterpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
