package com.buer.desginpatterns.facadepattern;

/**
 * Created by YanMingDao on 03/04/2017.
 */

public class ClientServerFacade {
    private Check check;
    private Weight weight;
    private Transport transport;
    private String bundle;

    public ClientServerFacade(String bundle) {
        this.bundle = bundle;
        this.check = new Check(bundle);
        this.weight = new Weight(bundle);
        this.transport = new Transport(bundle);
    }

    public void sendBundle() {
        this.check.doCheck();
        this.weight.doWeight();
        this.transport.doTransport();
    }

}
