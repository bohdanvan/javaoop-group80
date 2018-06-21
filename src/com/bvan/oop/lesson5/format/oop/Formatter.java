package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter {

    public static final int X = 10; // BAD PRACTICE

    String format(Product product);

    default void print(Product product) {
        String s = format(product);
        System.out.println(s);
    }
}
