package oop.abstraction.interfacedemo;

public class Three implements One,Two{
    @Override
    public void play() {
        System.out.println("Hey! I'm in three");
    }
}
