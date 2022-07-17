package oop.statickeyword;

public class Student {
    String name, id;
    static String universityName = "SEC";
    static int count = 0;
    Student(String name, String id) {
        this.name = name;
        this.id = id;
        count++;
    }
    void displayInformation() {
        System.out.println("Name: "+name);
        System.out.println("Id:"+id);
        System.out.println("University name: "+universityName);
    }
    void displayCount() {
        System.out.println("Total object(s) created: "+count);
    }
    void nonStaticMethod() {
        System.out.println("This is a non static method!");
    }
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    static int roll;
    static String status;
    static {
        roll = 12;
        status = "Back Bencher";
        System.out.println("In static block");
    }

    public static void main(String[] args) {
        System.out.println("Main funciton!");
        System.out.println(Student.status);
    }
}
