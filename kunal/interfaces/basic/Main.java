package oop.kunal.interfaces.basic;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        System.out.println(Engine.PRICE);
//        car.acc();
//        Media carMedia = new Car();
//        carMedia.start();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
