package com.bvan.oop.lesson6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    ACTION("ACTION DESCR"),
    DRAMA("DRAMA DESCR"),
    COMEDY("Funny movie");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 3);
    }

    public String getDescription() {
        return description;
    }
}
