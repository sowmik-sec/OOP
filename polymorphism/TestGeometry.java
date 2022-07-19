package oop.polymorphism;

public class TestGeometry {
    public static void main(String[] args) {

        Shape[] s = new Shape[3];
        s[0] = new Rectangle(10,20);
        s[1] = new Triangle(10,20);
        s[2] = new Shape();
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }
    }
}
