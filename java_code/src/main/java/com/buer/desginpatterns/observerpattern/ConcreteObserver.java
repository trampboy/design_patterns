package com.buer.desginpatterns.observerpattern;



/**
 * Created by YanMingDao on 04/04/2017.
 */
public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
     System.out.println("update:" + subject.getState());
    }
}
