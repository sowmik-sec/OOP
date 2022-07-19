package oop.inheritance;

public class Person extends Animal {
    private String name;
    private int age;
    void displayInformation() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
