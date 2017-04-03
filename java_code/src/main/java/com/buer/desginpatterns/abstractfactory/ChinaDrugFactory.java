package com.buer.desginpatterns.abstractfactory;

/**
 * Created by YanMingDao on 02/04/2017.
 */

public class ChinaDrugFactory implements AbstractFactory {

    @Override
    public Drug createAmorolfine() {
        return new ChinaAmorolfine();
    }

    @Override
    public Drug createParacetamol() {
        return new ChinaParacetamol();
    }
}
