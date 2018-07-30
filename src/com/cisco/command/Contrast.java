package com.cisco.command;

/**
 * Created by shkk on 7/30/2018.
 */
public class Contrast implements Command {

    public PhotoShop photoShop;

    public Contrast(PhotoShop photoShop) {
        this.photoShop = photoShop;
    }

    @Override
    public void execute() {
        photoShop.increaseContrast();
    }

    @Override
    public void unexecute() {
        photoShop.decreaseBrightness();
    }


}
