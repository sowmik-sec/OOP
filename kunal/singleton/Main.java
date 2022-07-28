package oop.kunal.singleton;

public class Main {
    public static void main(String[] a) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        Singleton ob3 = Singleton.getInstance();
        // All three variables are pointing to the same object.
    }
}
