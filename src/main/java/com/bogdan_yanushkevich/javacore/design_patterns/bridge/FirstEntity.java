package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

public class FirstEntity implements SomeEntity {
    @Override
    public void doingSomething() {
        System.out.println("First entity doing something");
    }
}
