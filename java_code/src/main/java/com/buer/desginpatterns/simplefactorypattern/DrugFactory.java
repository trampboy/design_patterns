package com.buer.desginpatterns.simplefactorypattern;

/**
 * Created by YanMingDao on 02/04/2017.
 */
public class DrugFactory {
    public static Drug createDrug(String drugName) {
        if ("paracetamol".equals(drugName)) {
            return new Paracetamol();
        } else if ("amorolfine".equals(drugName)) {
            return new Amorolfine();
        }
        return null;
    }
}
