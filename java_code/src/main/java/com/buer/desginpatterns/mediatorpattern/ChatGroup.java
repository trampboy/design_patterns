package com.buer.desginpatterns.mediatorpattern;

import java.util.ArrayList;

/**
 * Created by YanMingDao on 04/04/2017.
 */
public class ChatGroup extends AbstractChatroom{
    private ArrayList<Member> arrMember = new ArrayList<>();

    public void register(Member member) {
        arrMember.add(member);
        member.setChatRoom(this);
    }

    @Override
    void sendImage() {
        for (Member member: arrMember) {
            member.receiveImage();
        }
    }

    @Override
    void sendText() {
        for (Member member: arrMember) {
            member.receiveText();
        }
    }
}
