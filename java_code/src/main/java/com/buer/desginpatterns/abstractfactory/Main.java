package com.buer.desginpatterns.abstractfactory;

/**
 * 抽象类工厂模式
 * Created by YanMingDao on 02/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        AbstractFactory chinaFactory = new ChinaDrugFactory();
        System.out.println(chinaFactory.createAmorolfine().getName());
        System.out.println(chinaFactory.createParacetamol().getName());
        AbstractFactory americaFactory = new AmericaDrugFactory();
        System.out.println(americaFactory.createAmorolfine().getName());
        System.out.println(americaFactory.createParacetamol().getName());
    }
}
