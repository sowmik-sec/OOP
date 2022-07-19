package oop.inheritance;

public class Teacher extends Person {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    void displayInformation() {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println(qualification);
    }
}
