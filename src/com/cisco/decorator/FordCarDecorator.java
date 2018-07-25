package com.cisco.decorator;

/**
 * Created by shkk on 7/25/2018.
 */
public class FordCarDecorator extends CarDecorator {

    Car car;

    public FordCarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("-->Ford Car Decorator");
    }
}
