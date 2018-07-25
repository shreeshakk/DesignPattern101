package com.cisco.decorator;

/**
 * Created by shkk on 7/25/2018.
 */
public class Volkswagen extends CarDecorator {

    Car car;

    public Volkswagen(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("-->Volkswagen Car Decorator");
    }
}
