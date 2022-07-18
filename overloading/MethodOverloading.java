package oop.overloading;

public class MethodOverloading {
    void add(int a, int b) {
        System.out.println("Ans = "+(a+b));
    }
    void add(int a, int b, int c) {
        System.out.println("Ans = "+(a+b+c));
    }
    int a = 10, b = 20;
    public static void main(String[] args) {
        MethodOverloading ob1 = new MethodOverloading();
        ob1.add(5,6,7);
        MethodOverloading.swap(ob1);
        System.out.println(ob1.a+" "+ ob1.b);
    }

    private static void swap(MethodOverloading ob2) {
        int temp = ob2.a;
        ob2.a = ob2.b;
        ob2.b = temp;
    }
}
