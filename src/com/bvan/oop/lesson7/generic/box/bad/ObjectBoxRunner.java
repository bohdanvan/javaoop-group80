package com.bvan.oop.lesson7.generic.box.bad;

import com.bvan.oop.lesson7.generic.box.Cat;
import com.bvan.oop.lesson7.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox catBox = new ObjectBox(dog);

        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            System.out.println("Where is my cat???");
        }
    }
}
