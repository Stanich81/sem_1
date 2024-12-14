package main.java.lesson2;

import java.sql.SQLOutput;

public class Animal {
    protected String type;
    protected String name;

    public Animal(String name) {
        this.name = name;
        this.type = getClass().getSimpleName();
    }

    protected void fly () {
        System.out.printf("%s %s fly!%n", type, name);
    }

    @Override
    public String toString() {
        return String.format("%s name %s", type, name);
    }
}
