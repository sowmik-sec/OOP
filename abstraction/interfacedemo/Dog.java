package oop.abstraction.interfacedemo;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dogs eat everything.");
    }
}
