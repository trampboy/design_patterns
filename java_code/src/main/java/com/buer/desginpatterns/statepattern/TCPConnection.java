package com.buer.desginpatterns.statepattern;

/**
 * Created by YanMingDao on 09/04/2017.
 */

public class TCPConnection {
    private TCPState tcpState;

    public TCPConnection() {
        this.tcpState = new TCPClosed();
    }

    public void activeOpen() {
        this.tcpState.activeOpen(this);
    }

    public void changeState(TCPState tcpState) {
        this.tcpState = tcpState;
    }

    public void close() {
        this.tcpState.close(this);
    }

    public void processOctet(TCPStream tcpStream) {
        this.tcpState.transmit(this, tcpStream);
    }

    public void send() {
        this.tcpState.send(this);
    }

}
