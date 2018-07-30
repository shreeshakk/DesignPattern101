package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class DellLaptopCharger implements USElectricalCharger {

    @Override
    public void giveElectricity() {
        System.out.println("Dell Laptop Consuming Electricity");
    }
}
