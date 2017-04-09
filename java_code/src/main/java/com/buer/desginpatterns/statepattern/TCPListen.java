package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */

public class TCPListen extends TCPState {
    @Override
    public void send(TCPConnection tcpConnection) {
        System.out.println("TCPListen send");
        tcpConnection.changeState(new TCPEstablished());
    }
}
