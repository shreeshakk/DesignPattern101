package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class SonyTvCharger implements IndiaElectricalCharger {

    @Override
    public void giveElectricity() {
        System.out.println("SonyTv  Consuming Electricity");
    }
}
