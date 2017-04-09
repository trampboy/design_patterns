package com.buer.desginpatterns.strategypattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.algorithm();
        context.setStrategy(new ConcreteStrategyB());
        context.algorithm();
    }
}
