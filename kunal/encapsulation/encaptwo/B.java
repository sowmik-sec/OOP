package oop.kunal.encapsulation.encaptwo;

import oop.kunal.encapsulation.encapone.A;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.name = "Ahsan Habib";
        System.out.println(b.name);
        System.out.println(b.aaa);
    }
}
