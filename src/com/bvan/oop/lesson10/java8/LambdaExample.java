package com.bvan.oop.lesson10.java8;

import com.bvan.oop.lesson5.format.Product;
import com.bvan.oop.lesson5.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        Formatter csvFormatter =
                p -> p.getName() + "," + p.getPrice();

        String s = csvFormatter.format(new Product("Lenovo", 2000));
        System.out.println(s);
    }
}
