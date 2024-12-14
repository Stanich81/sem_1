package main.java.lesson1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(),"чумка", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(1996, 6, 6), new ArrayList<>(),"чумка", "Boss");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);

        Fish goldy = new Fish("Goldy", LocalDate.of(2000, 1, 10), new ArrayList<>(),"нет", "Bill");
        Mouse mikky = new Mouse("Mikky", LocalDate.of(2010, 8, 20), new ArrayList<>(),"нет", "Tom");

        mikky.fly();










    }
}