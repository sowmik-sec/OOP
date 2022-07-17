package oop.basicoop;

public class Test {
    String works;
    public static void main(String[] args) {
        Student student1 = new Student("Ahsan Habib","Male",26,"014324234234");
        student1.displayInformation();

        Student student2 = new Student("Sowmik","Male",26,"015234234234");
        student2.displayInformation();
        Student student3 = new Student();
        student3.displayInformation();
    }
}
