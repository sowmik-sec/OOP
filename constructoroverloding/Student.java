package oop.constructoroverloding;

public class Student {
    String name, gender;
    int age;
    Student() {
        System.out.println("Didn't initialized");
    }
    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    Student(String name ,String gender) {
        this.name = name;
        this.gender = gender;
    }
    void displayInformation() {
        System.out.println(name+"\n"+age+"\n"+gender+"\n");
    }
}
