package com.buer.desginpatterns.facadepattern;

/**
 * 外观模式
 * Created by YanMingDao on 03/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        ClientServerFacade clientServerFacade = new ClientServerFacade("苹果电脑");
        clientServerFacade.sendBundle();
    }
}
