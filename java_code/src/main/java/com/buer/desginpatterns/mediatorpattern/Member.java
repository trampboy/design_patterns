package com.buer.desginpatterns.mediatorpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public abstract class Member {
    AbstractChatroom abstractChatroom;

    abstract void sendText();

    void sendImage() {}

    void receiveText() {
        System.out.println(getName() + " receiveText");
    }

    void receiveImage() {
        System.out.println(getName() + " receiveImage");
    }

    void setChatRoom(AbstractChatroom chatRoom) {
        this.abstractChatroom = chatRoom;
    }

    abstract String getName();
}
