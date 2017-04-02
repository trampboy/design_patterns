package com.buer.desginpatterns.simplefactorypattern;

/**
 * 简单工厂类模式
 * Created by YanMingDao on 02/04/2017.
 */

public class Main {
    public static void main(String args[]) {
        Drug paracetamol = DrugFactory.createDrug("paracetamol");
        System.out.println("paracetamol name:" + paracetamol.getName());
        Drug amorolfine = DrugFactory.createDrug("amorolfine");
        System.out.println("amorolfine name:" + amorolfine.getName());
    }
}
