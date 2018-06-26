package com.bvan.oop.lesson7.generic.pair;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> nameAge = new Pair<>("Anton", 30);

        Pair<String, String> nameSurname = new Pair<>("Vasya", "Ivanov");

        Pair<Pair<String, Long>, List<String>> x;
    }
}
