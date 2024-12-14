package main.java.lesson1;

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

    public void eat() {
        System.out.println("Животное поело");
    }
    public void play() {
        System.out.println("Животное поиграло");
    }
    public void sleep() {
        System.out.println("Животное уснуло");
    }
    public void toGo(){
        System.out.println("Животное двигается");
    }
    public void fly(){
        System.out.println("Животное летает");
    }
    public void swim(){
        System.out.println("Животное плавает");
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
