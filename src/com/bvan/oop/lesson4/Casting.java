package com.bvan.oop.lesson4;

/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        long x = 3_000_000_000L;
        int y = (int) x; // BAD PRACTICE
        System.out.println(y);
    }
}
