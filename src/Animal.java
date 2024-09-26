import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthday;
    protected List<String> vaccination;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthday, List<String> vaccination, String illness, String owner) {
        this.name = name;
        this.birthday = birthday;
        this.vaccination = vaccination;
        this.illness = illness;
        this.owner = owner;
    }

    public String getIllness() {
        return illness;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getOwner() {
        return owner;
    }

    public void wakeup() {
        System.out.println("Животное простулось");
    }

    public void wakeup(int time) {
        System.out.println("Животное простулось в " + time);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
