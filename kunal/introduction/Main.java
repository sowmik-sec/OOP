package oop.kunal.introduction;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.changeName("Ahsan");
        student1.greeting();
        Student student2 = new Student(12,"Habib",72.4);
        System.out.println(student2.marks);
        Student student3 = new Student(student2);
        System.out.println(student3.name);
        System.out.println(student1.marks);
    }
}

class Student {
    int rno;
    String name;
    double marks;

    void greeting() {
        System.out.println("Hello! My name is "+name);
    }
    void changeName(String name) {
        this.name = name;
    }
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student() {
        this(10,"Sowmik",76);
    }
    Student(int rno, String name, double marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
}