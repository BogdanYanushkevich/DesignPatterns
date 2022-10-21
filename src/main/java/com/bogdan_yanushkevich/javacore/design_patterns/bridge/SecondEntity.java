package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

public class SecondEntity implements SomeEntity{
    @Override
    public void doingSomething() {
        System.out.println("Second entity doing something");
    }
}
