package com.cisco.observer;

/**
 * Created by Shreesha on 9/23/2016.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject s) {
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
}
