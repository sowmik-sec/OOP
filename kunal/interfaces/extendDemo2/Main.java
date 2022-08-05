package oop.kunal.interfaces.extendDemo2;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("I'm(greet) in main class");
    }

    //@Override
//    public void fun() {
//        System.out.println("I'm(fun) in main class");
//    }

    public static void main(String[] args) {
        A obj = new Main();
        obj.fun();
    }
}
