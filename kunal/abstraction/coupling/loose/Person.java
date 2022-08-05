package oop.kunal.abstraction.coupling.loose;

public class Person {
    public static void main(String[] args) {
        Transport transport1 = new Bus();
        Transport transport2 = new Train();
        ITravel travel = new Travel(transport2);
        travel.start();
        transport1.start();
    }
}
