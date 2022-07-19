package oop.abstraction;

public class Triangle extends Shape{

    Triangle(int base, int height) {
        super(base,height);
    }
    @Override
    void area() {
        System.out.println("Area of this circle is "+(0.5*d1*d2));
    }
}
