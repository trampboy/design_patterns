package com.buer.desginpatterns.commandpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class TVCloseCommand implements Command {
    private Televation televation;

    public TVCloseCommand(Televation televation) {
        this.televation = televation;
    }

    @Override
    public void execute() {
        this.televation.off();
    }
}
