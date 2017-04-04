package com.buer.desginpatterns.proxypattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject");
    }
}
