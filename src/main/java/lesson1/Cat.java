package main.java.lesson1;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;

    public Cat(String name, LocalDate birthday, List<String> vaccination, String illness, String owner, int legsCount) {
        super(name, birthday, vaccination, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
}
