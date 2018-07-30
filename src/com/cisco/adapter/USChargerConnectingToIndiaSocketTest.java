package com.cisco.adapter;

/**
 * Created by shkk on 7/29/2018.
 */
public class USChargerConnectingToIndiaSocketTest {

    public static void main(String[] args) {

        USElectricalCharger usElectricalCharger = new DellLaptopCharger();
        IndiaElectricalSocket indiaElectricalSocket = new IndiaElectricalSocket();

        //adapter converts one type of interface to another
        IndiaElectricalCharger indiaElectricalCharger = new USToIndiaElectricalAdapter(usElectricalCharger);
        indiaElectricalSocket.connect(indiaElectricalCharger);
    }
}
