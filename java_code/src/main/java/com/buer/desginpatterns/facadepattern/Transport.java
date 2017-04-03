package com.buer.desginpatterns.facadepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */
public class Transport {
    private String bundle;
    public Transport(String bundle) {
        this.bundle = bundle;
    }

    public void doTransport() {
        System.out.println("开始运输：" + this.bundle);
    }
}
