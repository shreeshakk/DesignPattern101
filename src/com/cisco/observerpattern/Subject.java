package com.cisco.observerpattern;

/**
 * Created by Shreesha on 9/23/2016.
 */
public class Subject {

    private Observer[] observers = new Observer[9];
    private int totalObs = 0;
    private int state;

    public void attach(Observer o) {
        observers[totalObs++] = o;
    }

    public int getState() {
        return state;
    }

    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    public void notifyObservers() {
        for (int i = 0; i < totalObs; i++) {
            observers[i].update();
        }
    }
}
