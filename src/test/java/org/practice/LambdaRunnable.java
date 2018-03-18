package org.practice;

import java.util.Comparator;

public class LambdaRunnable {

    public void oldWayOfDoing() {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Display");
            }
        };
    }

    public void newWayOfDOing() {
        Runnable r = () -> {
            System.out.println("Display");
        };

    }
}
