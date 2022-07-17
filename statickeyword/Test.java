package oop.statickeyword;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Sowmik","506");
        student.displayInformation();
        Student.universityName = "fadfd";
        student.displayInformation();
        Student student2 = new Student("Sowmik","505");
        Student student3 = new Student("Sowmik","504");
        Student student4 = new Student("Sowmik","503");
        student4.displayCount();
        Student.staticMethod();
    }
}
