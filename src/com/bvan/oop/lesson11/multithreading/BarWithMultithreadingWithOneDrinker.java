package com.bvan.oop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreadingWithOneDrinker {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        Thread dT1 = new Thread(new Drinker(1));
        dT1.start();

        Thread dT2 = new Thread(new Drinker(2));
        dT2.start();

        try {
            dT1.join(10000);
//            dT2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
