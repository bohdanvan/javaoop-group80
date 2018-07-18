package com.bvan.oop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int i = 1; i <= 5; i++) {
            Runnable drinker = new Drinker(i);
            Thread drinkerThread = new Thread(drinker);
            drinkerThread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
