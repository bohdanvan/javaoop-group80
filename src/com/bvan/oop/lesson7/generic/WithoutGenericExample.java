package com.bvan.oop.lesson7.generic;

import com.bvan.oop.lesson2.post.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample { // Java 5 (2005)

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add(10);
        names.add("Taras");
        names.add(new Post("a", "b", 10));

        String s = (String)names.get(0);
        System.out.println(s);

        System.out.println(names);
    }
}
