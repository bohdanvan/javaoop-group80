package com.bvan.oop.lesson7.generic.optional;

import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class OptionalExample {

    public static void main(String[] args) {
        String name = null;

        // Java 8
        Optional<String> name1 = Optional.of("Vasya");
        Optional<String> name2 = Optional.empty();

        if (name1.isPresent()) {
            String s = name1.get();
        }
    }
}
