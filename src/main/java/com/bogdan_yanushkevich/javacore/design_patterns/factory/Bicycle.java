package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class Bicycle implements Transport{

    @Override
    public void drive() {
        System.out.println("A Bicycle is driving.");
    }
}
