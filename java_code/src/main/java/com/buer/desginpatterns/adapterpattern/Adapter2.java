package com.buer.desginpatterns.adapterpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Adapter2 extends Adaptee2 implements Target {

    @Override
    public void request() {
        specialRequest();
    }
}
