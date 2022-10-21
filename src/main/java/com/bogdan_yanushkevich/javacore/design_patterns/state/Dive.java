package main.java.com.bogdan_yanushkevich.javacore.design_patterns.state;

public class Dive implements State {
    @Override
    public void start() {
        System.out.println("Bathyscaphe sinks to the bottom.");
    }
}
