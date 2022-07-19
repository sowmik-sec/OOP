package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Person p = new Person();
        Animal a = new Animal();
        t1.setName("Ahsan Habib");
        t1.setAge(26);
        t1.setQualification("BSc in CSE");
        t1.displayInformation();


        System.out.println(p instanceof Animal);
        System.out.println(t1 instanceof Person);
        System.out.println(t1 instanceof Animal);
        System.out.println(p instanceof Teacher);
    }
}
