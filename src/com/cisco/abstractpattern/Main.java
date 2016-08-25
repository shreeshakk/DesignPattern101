package com.cisco.abstractpattern;

/**
 * Created by shkk on 8/25/2016.
 */
public class Main {

    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();

        if (args.length != 1) {
            System.out.println("Invalid Argument length");
            System.exit(0);
        }

        if (args[0].equals("Windows")) {

            System.out.println("Initializing the Windows Pane");
            guiBuilder.buildWindow(new MSWindowsWidgetFactory());

        } else if (args[0].equals("MacOS")) {

            System.out.println("Initializing the MAC OS Pane");
            guiBuilder.buildWindow(new MacOSXWidgetFactory());

        } else {
            System.err.println("Invalid argument");
        }
    }
}
