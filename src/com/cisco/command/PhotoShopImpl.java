package com.cisco.command;

/**
 * Created by shkk on 7/30/2018.
 */
public class PhotoShopImpl implements PhotoShop {

    @Override
    public void decreaseBrightness() {
        System.out.println("Decrease Brightness");
    }

    @Override
    public void increaseBrightness() {
        System.out.println("Increase Brightness");
    }

    @Override
    public void decreaseContrast() {
        System.out.println("Decrease Contrast");
    }

    @Override
    public void increaseContrast() {
        System.out.println("Increase Contrast");
    }

}
