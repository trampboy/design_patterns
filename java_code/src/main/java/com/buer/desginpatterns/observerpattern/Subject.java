package com.buer.desginpatterns.observerpattern;

import java.util.ArrayList;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public abstract class Subject {
    private ArrayList<Observer> arrayList = new ArrayList<>();

    void attach(Observer observer){
        arrayList.add(observer);
    }

    void nofify() {
        for (Observer observer: arrayList) {
            observer.update();
        }
    }
}
