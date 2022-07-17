package oop.basicoop;

public class Student {
    Student(String n,String m, int a, String ph) {
        name = n;
        gender = m;
        age = a;
        phone = ph;
    }
    Student() {
        System.out.println("Didn't initialized!");
    }
    String name, gender, phone;
    int age;
    void displayInformation() {
        System.out.println(name+"\n"+age+"\n"+gender+"\n"+phone+"\n");
    }
    void setInformation(String n, String m,int a, String ph) {
        name = n;
        gender = m;
        age = a;
        phone = ph;
    }
}
