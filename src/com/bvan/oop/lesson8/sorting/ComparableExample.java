package com.bvan.oop.lesson8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ComparableExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Vlad",
                "Ivan",
                "Boris",
                "Masha",
                "Boris"
        );
        Collections.sort(names);

        System.out.println(names);
    }
}
