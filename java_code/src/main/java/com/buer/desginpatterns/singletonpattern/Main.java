package com.buer.desginpatterns.singletonpattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
