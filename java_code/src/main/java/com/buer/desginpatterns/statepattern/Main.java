package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 04/04/2017.
 */

public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        tcpConnection.activeOpen();
        tcpConnection.processOctet(new TCPStream());
        tcpConnection.close();
        tcpConnection.send();
    }
}
