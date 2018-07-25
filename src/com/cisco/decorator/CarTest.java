package com.cisco.decorator;

/**
 * Created by shkk on 7/25/2018.
 */
public class CarTest {

    public static void main(String[] args) {

        Car basicCar = new BasicCar();
        Car fordCar = new FordCarDecorator(basicCar);
        Car volkswagenCar = new Volkswagen(basicCar);

        fordCar.assemble();
        System.out.println();
        volkswagenCar.assemble();

    }
}
