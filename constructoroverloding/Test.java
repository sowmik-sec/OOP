package oop.constructoroverloding;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInformation();
        Student student2 = new Student("Ahsan",26);
        student2.displayInformation();
        Student student3 = new Student("Habib","Male");
        student3.displayInformation();
    }
}
