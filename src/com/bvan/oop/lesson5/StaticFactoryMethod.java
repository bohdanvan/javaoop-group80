package com.bvan.oop.lesson5;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class StaticFactoryMethod {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2018, 1, 10);
    }
}
