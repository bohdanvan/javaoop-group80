package com.bvan.oop.lesson6.enum_example.gender.bad;

import static com.bvan.oop.lesson6.enum_example.gender.bad.BadUser.MALE;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser user = new BadUser("John", 20, MALE);
        String genderName = user.getGenderName();
        System.out.println(genderName);
    }
}
