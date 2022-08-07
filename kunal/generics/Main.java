package oop.kunal.generics;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            list.add(num);
        }
        System.out.println(list);
        list.set(2,134);
        System.out.println(list);
    }


}
