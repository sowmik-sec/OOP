package oop.kunal.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hey, I am in Box class.");
    }

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old) {
        this.w = old.w;
        this.h = old.h;
        this.l = old.l;
    }
}
