package com.buer.desginpatterns.mediatorpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */
public class DiamondMember extends Member {
    @Override
    void sendText() {
        abstractChatroom.sendText();
    }

    @Override
    void sendImage() {
        abstractChatroom.sendImage();
    }

    @Override
    String getName() {
        return "DiamondMember";
    }
}
