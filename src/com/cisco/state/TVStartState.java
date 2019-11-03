package com.cisco.state;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV Turned ON");
    }
}
