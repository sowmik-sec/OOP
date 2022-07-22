package oop.kunal.static_keyword;

public class StaticTest {
    static int a = m1();
    static{
        System.out.println("Inside static block");
    }
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Value of a: "+a);
        System.out.println("from main");
    }
}
