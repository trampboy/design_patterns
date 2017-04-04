package com.buer.desginpatterns.mediatorpattern;


/**
 * Created by YanMingDao on 04/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        Member commandMember = new CommandMember();
        Member diamondMember = new DiamondMember();
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.register(commandMember);
        chatGroup.register(diamondMember);
        commandMember.sendText();
        commandMember.sendImage();
        diamondMember.sendText();
        diamondMember.sendImage();
    }
}
