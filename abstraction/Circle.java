package oop.abstraction;

public class Circle extends Shape{
    //int radius;
    Circle(int radius) {
        super(radius,radius);
    }
    @Override
    void area() {
        System.out.println("Area of this circle is "+(Math.PI*d1*d2));
    }
}
