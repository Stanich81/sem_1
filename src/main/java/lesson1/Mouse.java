package main.java.lesson1;

import java.time.LocalDate;
import java.util.List;

public class Mouse extends Animal{
    public Mouse(String name, LocalDate birthday, List<String> vaccination, String illness, String owner) {
        super(name, birthday, vaccination, illness, owner);
    }
}
