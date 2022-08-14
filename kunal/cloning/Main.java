package oop.kunal.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ahsan = new Human("Ahsan",26);
        //Human habib = new Human(ahsan);

        Human twin = (Human)ahsan.clone();

        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(ahsan.arr));
    }
}
