package com.cisco.abstractpattern;

/**
 * Created by shkk on 8/25/2016.
 */
public class MacOSXWindow implements Window {

    @Override
    public void setTitle(String text) {
        System.out.println("Setting title for MAC OSX");
    }

    @Override
    public void repaint() {
        System.out.println("Painting for MAC OSX");
    }
}
