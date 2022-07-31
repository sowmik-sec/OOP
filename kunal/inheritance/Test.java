package oop.kunal.inheritance;

import java.util.List;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        //parent.display();
        Parent parent1 = new Child();
        Parent parent2 = new Child3();
        Child2 child2 = new Child3();
        //child2.display();
        Child3 child3 = new Child3();
        child3.display(5);
        //parent2.display();
    }
    List<Integer> m1() {
        Vector<Integer> v = new Vector<>();
        return v;
    }
}
