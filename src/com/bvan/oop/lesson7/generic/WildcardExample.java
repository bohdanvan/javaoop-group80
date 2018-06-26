package com.bvan.oop.lesson7.generic;

import com.bvan.oop.lesson5.format.oop.Formatter;
import com.bvan.oop.lesson5.format.oop.NameFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WildcardExample {

    public static void main(String[] args) {
        List<Formatter> formatters = new ArrayList<>();
        formatters.add(new NameFormatter());

        List<NameFormatter> nameFormatters = new ArrayList<>();
        formatters.add(new NameFormatter());

        f(nameFormatters);
    }

    public static void f(List<? extends Formatter> formatters) {
        for (Formatter formatter : formatters) {
//            formatter.format()
        }
    }
}
