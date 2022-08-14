package oop.kunal.cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{3,4,6};
    }

//    public Human(Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }

//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
