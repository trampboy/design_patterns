package com.buer.desginpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap;

    public FlyweightFactory() {
        flyweightMap = new HashMap<>();
    }

    public Flyweight getFlyweight(String key) {
        if (flyweightMap.containsKey(key)) {
            return flyweightMap.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight();
            flyweightMap.put(key, flyweight);
            return flyweight;
        }
    }
}
