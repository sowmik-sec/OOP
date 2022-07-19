package oop.abstraction;

public class TestMobileUsers {
    public static void main(String[] args) {
        MobileUser u = new Ahsan();
        u.sendMessage();
        u = new Habib();
        u.sendMessage();
    }
}
