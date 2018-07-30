package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class USToIndiaElectricalAdapter implements IndiaElectricalCharger {

    public USElectricalCharger usElectricalCharger;

    public USToIndiaElectricalAdapter(USElectricalCharger usElectricalCharger) {
        this.usElectricalCharger = usElectricalCharger;
    }

    @Override
    public void giveElectricity() {
        usElectricalCharger.giveElectricity();
    }
}
