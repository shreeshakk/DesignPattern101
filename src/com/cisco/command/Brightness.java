package com.cisco.command;

/**
 * Created by shkk on 7/30/2018.
 */
public class Brightness implements Command {

    public PhotoShop photoShop;

    public Brightness(PhotoShop photoShop) {
        this.photoShop = photoShop;
    }

    @Override
    public void execute() {
        photoShop.increaseBrightness();
    }

    @Override
    public void unexecute() {
        photoShop.decreaseBrightness();
    }
}
