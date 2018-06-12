package com.bvan.oop.lesson3.menu;

public class MenuRunner {
    public static void main(String[] args) {
        Menu firstMenu = new Menu("First menu");
        Menu secondMenu = new Menu("Second menu");

        Dish dishOne = new Dish("Cracker ravioli", "Something about ravioli", 500);
        Dish dishTwo = new Dish("Carbonara cake", "Something about cake", 150);
        Dish dishThird = new Dish("Turkey risotto", "Something about risotto", 300);
        Dish dishFour = new Dish("Craig David's Grenadian chicken",
                "Something about chicken", 1000);

        firstMenu.addDish(dishOne);
        firstMenu.addDish(dishFour);
        firstMenu.addDish(dishThird);

        System.out.println(firstMenu.toString());
        System.out.println("The chipest dish is: " + firstMenu.getCheapestDish().getName());

        secondMenu.addDish(dishOne);
        secondMenu.addDish(dishFour);
        secondMenu.addDish(dishTwo);

        System.out.println(secondMenu.toString());
        System.out.println("The chipest dish is: " + secondMenu.getCheapestDish().getName());
    }
}