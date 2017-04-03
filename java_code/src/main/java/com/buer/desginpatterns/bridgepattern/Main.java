package com.buer.desginpatterns.bridgepattern;



/**
 * 桥接者模式
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new Red());
        System.out.println(rectangle.getDescription());
        System.out.println(rectangle.getColor());

        Shape circle = new Circle(new Green());
        System.out.println(circle.getDescription());
        System.out.println(circle.getColor());
    }
}
