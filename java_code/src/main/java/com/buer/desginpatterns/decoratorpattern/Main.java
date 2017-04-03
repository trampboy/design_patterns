package com.buer.desginpatterns.decoratorpattern;

/**
 * 修饰模式
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Car());
        robot.move();

        Airplane airplane = new Airplane(new Car());
        airplane.move();
    }
}
