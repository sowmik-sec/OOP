package oop.kunal.abstraction.coupling.loose;

public class Train implements Transport{
    @Override
    public void start() {
        System.out.println("Train trip started");
    }
}
