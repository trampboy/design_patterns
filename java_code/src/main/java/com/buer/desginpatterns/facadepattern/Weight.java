package com.buer.desginpatterns.facadepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */
public class Weight {
    private String bundle;
    public Weight(String bundle) {
        this.bundle = bundle;
    }

    public void doWeight(){
        System.out.println("开始检测重量：" + this.bundle);
    }
}
