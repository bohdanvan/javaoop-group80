package com.bvan.oop.lesson1.dynamicarray.proc;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class TestReadClientElem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = DynamicArrayAppV1.readClientElem(scanner);
        System.out.println(n);
    }
}
