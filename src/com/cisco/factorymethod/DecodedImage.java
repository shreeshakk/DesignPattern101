package com.cisco.factorymethod;

/**
 * Created by shkk on 9/1/2016.
 */
public class DecodedImage {

    private String type;

    DecodedImage(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
