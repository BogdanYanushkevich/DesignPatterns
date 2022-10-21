package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("A Сar is driving.");
    }
}
