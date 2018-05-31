package com.bvan.oop.lesson2.storing;

/**
 * @author bvanchuhov
 */
public class ImmutableExample {

    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(", world");
        System.out.println(s); // Hello
    }
}
