package oop.some_built_in_classes;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        Student s1 = new Student(506,"Ahsan");
        Student s2 = new Student(507,"Habib");
        Student s3 = new Student(508,"Sowmik");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Student.className = "13";
        for (Student s : list) {
            System.out.println("id: "+s.id+" Name: "+s.name+" Class: "+Student.className);
        }
    }
}
