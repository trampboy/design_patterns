package com.buer.desginpatterns.commandpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Televation televation = new Televation();
        Command tvOpenCommand = new TVOpenCommand(televation);
        Controller controller = new Controller(tvOpenCommand);
        controller.open();

        controller = new Controller(new TVCloseCommand(televation));
        controller.off();
    }
}
