package com.buer.desginpatterns.observerpattern;



/**
 * Created by YanMingDao on 04/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        subject.attach(observer);
        subject.setState("open");
    }
}
