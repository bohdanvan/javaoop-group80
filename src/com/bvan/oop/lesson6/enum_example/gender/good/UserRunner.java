package com.bvan.oop.lesson6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        Gender gender = Gender.UNDEFINED;
        User user = new User("Taras", 25, gender);
//        user.getGenderName()

        System.out.println(gender.name()); // MALE
        System.out.println(gender.ordinal()); // 0
    }
}
