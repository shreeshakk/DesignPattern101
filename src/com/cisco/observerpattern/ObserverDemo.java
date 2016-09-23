package com.cisco.observerpattern;

import java.util.Scanner;

/**
 * Created by Shreesha on 9/23/2016.
 */
public class ObserverDemo {

    public static void main(String[] args) {

        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        new BinaryObserver(sub);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter a number:");
            sub.setState(scan.nextInt());
        }

    }
}
