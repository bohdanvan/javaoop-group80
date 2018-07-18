package com.bvan.oop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        new Drinker(1).run();
//        new Drinker(2).run();

        ThreadUtils.println("Bar is closed");
    }
}

