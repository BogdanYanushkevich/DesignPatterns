package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("A Bus is driving.");
    }
}
