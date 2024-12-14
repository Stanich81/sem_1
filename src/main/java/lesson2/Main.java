package main.java.lesson2;

import main.java.lesson2.impl.Cat;
import main.java.lesson2.impl.Eagle;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Eagle eagle = new Eagle("Innokenty");

//        System.out.println(cat.name);

        cat.fly();
        eagle.fly();

    }
}
