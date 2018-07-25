package com.cisco.decorator;

/**
 * Created by shkk on 7/25/2018.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car");
    }
}
