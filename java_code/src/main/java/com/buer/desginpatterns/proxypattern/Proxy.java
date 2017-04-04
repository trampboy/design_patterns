package com.buer.desginpatterns.proxypattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    private void afterRequest() {
        System.out.println("afterRequest");
    }

    private void preRequest() {
        System.out.println("preRequest");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        afterRequest();
    }
}
