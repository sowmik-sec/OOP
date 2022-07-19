package oop.abstraction;

public class TestGeometry {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.area();
        s = new Rectangle(52,12);
        s.area();
        s = new Triangle(4,3);
        s.area();
    }
}
