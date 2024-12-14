package main.java.lesson2.impl;

import main.java.lesson2.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("%s gon't fly!%n", type);
    }
}
