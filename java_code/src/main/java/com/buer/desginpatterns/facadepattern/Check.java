package com.buer.desginpatterns.facadepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Check {
    private String bundle;
    public Check(String bundle) {
        this.bundle = bundle;
    }

    public void doCheck(){
        System.out.println("开始检查包裹：" + this.bundle);
    }
}
