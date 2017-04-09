package com.buer.desginpatterns.strategypattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void algorithm() {
        this.strategy.algorithm();
    }
}
