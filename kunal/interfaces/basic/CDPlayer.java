package oop.kunal.interfaces.basic;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Media start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
