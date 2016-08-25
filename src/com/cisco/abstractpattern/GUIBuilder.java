package com.cisco.abstractpattern;

/**
 * Created by shkk on 8/25/2016.
 */
public class GUIBuilder {

    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");
    }
}
