package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class IndiaElectricalSocket {

    public void connect(IndiaElectricalCharger charger) {
        System.out.println("Connecting to India Socket");
        charger.giveElectricity();
    }
}
