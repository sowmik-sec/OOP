package oop.kunal.abstraction;

public abstract class Parent {

    String name;
    int age;

    Parent() {
        name = "Ahsan Habib";
        age = 26;
    }

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void carrer();
    abstract void partner();

    static void display() {
        System.out.println("Hey! I'm in static method of abstruct class");
    }

    void dislay2() {
        System.out.println("Hey! I'm in normal method.");
    }

    public static void main(String[] args) {
        Doughter parent = new Doughter();
        parent.dislay2();
    }
}
