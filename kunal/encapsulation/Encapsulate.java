package oop.kunal.encapsulation;

public class Encapsulate {
    private String name;
    private int roll;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

class TestEncasulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Ahsan Habib");
        obj.setAge(26);
        obj.setRoll(506);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll());
    }
}
