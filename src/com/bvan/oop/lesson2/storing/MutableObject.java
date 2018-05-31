package com.bvan.oop.lesson2.storing;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class MutableObject {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Masha");
        names.add("Ivan");
        System.out.println(names);

        ArrayList<String> newNames = names;
        newNames.add("Boris");

        System.out.println(names);
    }
}
