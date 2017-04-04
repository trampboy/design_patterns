package com.buer.desginpatterns.mediatorpattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public abstract class AbstractChatroom {
    abstract void register(Member member);
    abstract void sendImage();
    abstract void sendText();
}
