package com.cisco.observerpattern;

/**
 * Created by Shreesha on 9/23/2016.
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
