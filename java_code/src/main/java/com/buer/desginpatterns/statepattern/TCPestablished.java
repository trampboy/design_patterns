package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */

public class TCPEstablished extends TCPState{

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("TCPEstablished close");
        tcpConnection.changeState(new TCPListen());
    }

    @Override
    public void transmit(TCPConnection tcpConnection, TCPStream tcpStream) {
        System.out.println("TCPEstablished transmit");
    }
}
