package com.buer.desginpatterns.flyweightpattern;

/**
 * 享元模式
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("one");
        flyweight.operation();
    }
}

