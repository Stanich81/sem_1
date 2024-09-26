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

        eagle.wakeup();
        eagle.wakeup(2);

    }
}