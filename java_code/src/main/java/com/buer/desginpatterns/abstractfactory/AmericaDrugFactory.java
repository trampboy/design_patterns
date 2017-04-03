package com.buer.desginpatterns.abstractfactory;

/**
 * Created by YanMingDao on 02/04/2017.
 */

public class AmericaDrugFactory implements AbstractFactory {

    @Override
    public Drug createAmorolfine() {
        return new AmericaAmorolfine();
    }

    @Override
    public Drug createParacetamol() {
        return new AmericaParacetamol();
    }
}
