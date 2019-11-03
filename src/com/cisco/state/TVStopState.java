package com.cisco.state;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV Turned OFF");
    }
}
