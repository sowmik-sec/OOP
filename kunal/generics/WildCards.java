package oop.kunal.generics;

import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,5,6,7);
        System.out.println("Total sum is: "+sum(list1));
        List<Number> list2 = Arrays.asList(4.5,5,4.6f,6.0,7.1);
        System.out.println("Total sum is: "+sum(list2));

    }

    private static double sum(List<? extends Number> list1) {
        double sum = 0.0;
        for (Number i:list1) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
