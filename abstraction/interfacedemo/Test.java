package oop.abstraction.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
    }
}
