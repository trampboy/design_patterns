package com.buer.desginpatterns.strategypattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("ConcreteStrategyA algorithm");
    }
}
