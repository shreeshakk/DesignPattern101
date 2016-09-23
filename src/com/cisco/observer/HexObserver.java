package com.cisco.observer;

/**
 * Created by Shreesha on 9/23/2016.
 */
public class HexObserver extends Observer {

    public HexObserver(Subject s) {
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toHexString(subject.getState()));
    }
}
