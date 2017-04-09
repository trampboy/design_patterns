package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */
public abstract class TCPState {
    public void activeOpen(TCPConnection tcpConnection) {

    }

    public void close(TCPConnection tcpConnection) {

    }


    public void send(TCPConnection tcpConnection) {

    }

    public void transmit(TCPConnection tcpConnection, TCPStream tcpStream) {

    }

}
