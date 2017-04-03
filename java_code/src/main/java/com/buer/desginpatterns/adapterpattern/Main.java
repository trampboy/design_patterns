package com.buer.desginpatterns.adapterpattern;

/**
 * 适配器模式
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        //对象适配器
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();

        //类适配器
        Adapter2 adapter2 = new Adapter2();
        adapter2.request();
    }
}
