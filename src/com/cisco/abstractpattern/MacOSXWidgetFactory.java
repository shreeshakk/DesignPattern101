package com.cisco.abstractpattern;

/**
 * Created by shkk on 8/25/2016.
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSXWindow();
    }
}
