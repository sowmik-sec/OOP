package oop.abstraction;

public class Rectangle extends Shape{
    Rectangle(int height, int width) {
        super(height,width);
    }
    @Override
    void area() {
        System.out.println("Area of this Rectangle is "+(d1*d2));
    }
}
