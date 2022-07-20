package oop.some_built_in_classes;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ahsan");
        list.add("Habib");
        list.add("Sowmik");
        list.add(2,"fasdfd");
        for(String s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
        list.remove(2);
        for(String s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
