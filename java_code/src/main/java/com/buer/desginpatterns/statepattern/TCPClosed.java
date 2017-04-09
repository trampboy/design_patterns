package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */

public class TCPClosed extends TCPState{
    @Override
    public void activeOpen(TCPConnection tcpConnection) {
        System.out.println("TCPClose activeOpen");
        tcpConnection.changeState(new TCPEstablished());
    }
}
