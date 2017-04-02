package com.buer.desginpatterns.factorymethodpattern;



/**
 * 工厂方法模式
 * Created by YanMingDao on 02/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        AmorolfineFactory amorolfineFactory = new AmorolfineFactory();
        Drug amorolfine = amorolfineFactory.create();
        System.out.println("amorolfine name:" + amorolfine.getName());
        ParacetamolFactory paracetamolFactory = new ParacetamolFactory();
        Drug paracetamol = paracetamolFactory.create();
        System.out.println("paracetamol name:" + paracetamol.getName());
    }
}
