package main.java.lesson1;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthday, List<String> vaccination, String illness, String owner) {
        super(name, birthday, vaccination, illness, owner);
    }
}
