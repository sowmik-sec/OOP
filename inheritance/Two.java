package oop.inheritance;

public class Two extends One {
    int x = 110010;
    Two() {
        super();
        System.out.println("Two's constructor.");
    }
    void display() {
        super.display();
        System.out.println("Inside Two class");
        System.out.println(super.x);
    }
}
