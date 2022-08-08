package oop.kunal.generics;

import java.util.Scanner;



public class Main {

     static <T> T typechecking(T a) {
         T type = (T)("This is a type of "+a.getClass().getName());
         return type;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        CustomArrayList list = new CustomArrayList();
        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add("Hey");
        }

        System.out.println(list1);


        System.out.println(typechecking("fadfads"));
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            int num = in.nextInt();
//            list.add(num);
//        }
//        System.out.println(list);
//        list.set(2,134);
//        System.out.println(list);
    }


}
