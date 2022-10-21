package main.java.com.bogdan_yanushkevich.javacore.design_patterns.srategy;


public class Float implements State {
    @Override
    public void start() {
        System.out.println("Bathyscaphe floats to the surface.");
    }
}
