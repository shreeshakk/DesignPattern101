package com.cisco.abstractpattern;

/**
 * Created by shkk on 8/25/2016.
 */
public class MSWindow implements Window {


    @Override
    public void setTitle(String text) {
        System.out.println("Setting title for Microsoft Windows");
    }

    @Override
    public void repaint() {
        System.out.println("Painting for Microsoft Windows");
    }
}
