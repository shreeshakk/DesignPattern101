package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class USElectricalSocket {

    public void connect(USElectricalCharger charger) {
        System.out.println("Connecting to US Socket");
        charger.giveElectricity();
    }
}
