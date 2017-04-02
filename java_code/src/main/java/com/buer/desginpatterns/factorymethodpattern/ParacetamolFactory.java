package com.buer.desginpatterns.factorymethodpattern;

/**
 * Created by YanMingDao on 02/04/2017.
 */

public class ParacetamolFactory implements DrugFactory {
    @Override
    public Drug create() {
        return new Paracetamol();
    }
}
