package main.java.com.bogdan_yanushkevich.javacore.design_patterns.state;

public class Replenish implements State{
    @Override
    public void start() {
        System.out.println("Bathyscaphe replenishes supplies.");
    }
}
