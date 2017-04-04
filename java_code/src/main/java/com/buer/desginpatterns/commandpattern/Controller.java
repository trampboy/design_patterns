package com.buer.desginpatterns.commandpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */
public class Controller {
    private Command command;

    public Controller(Command command) {
        this.command = command;
    }

    public void open() {
        this.command.execute();
    }

    public void off() {
        this.command.execute();
    }
}
