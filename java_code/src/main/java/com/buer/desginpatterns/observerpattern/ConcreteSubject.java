package com.buer.desginpatterns.observerpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public void setState(String state) {
        this.state = state;
        nofify();
    }

    public String getState() {
        return state;
    }
}
