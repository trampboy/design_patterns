package com.buer.desginpatterns.mediatorpattern;


/**
 * Created by YanMingDao on 04/04/2017.
 */
public class CommandMember extends Member {

    @Override
    void sendText() {
        abstractChatroom.sendText();
    }

    @Override
    String getName() {
        return "CommandMember";
    }
}
