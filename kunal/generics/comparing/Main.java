package oop.kunal.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ahsan = new Student(12,72.5f);
        Student habib = new Student(10,74.8f);
        Student sowmik = new Student(9,75.2f);
        Student kimwos = new Student(42,52.1f);
        Student student5 = new Student(55,48.1f);
        Student student6 = new Student(78,35.1f);

        Student[] list = {ahsan, habib, sowmik, kimwos, student5, student6};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
//        if(ahsan.compareTo(habib)<0) {
//            System.out.println(ahsan.compareTo(habib));
//            System.out.println("Habib has more marks");
//        }
    }
}
