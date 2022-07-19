package oop.inheritance;

public class Human {
    String name;
    int age;
    String hairColor;
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Human(String name, int age, String hairColor) {
        this(name,age);
        this.hairColor = hairColor;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("HairColor: "+hairColor);
    }

}
