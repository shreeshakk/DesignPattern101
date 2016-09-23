package com.cisco.observerpattern;

/**
 * Created by Shreesha on 9/23/2016.
 */
public class OctObserver extends Observer {

    public OctObserver(Subject s) {
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
