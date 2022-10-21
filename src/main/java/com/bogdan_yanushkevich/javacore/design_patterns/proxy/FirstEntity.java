package main.java.com.bogdan_yanushkevich.javacore.design_patterns.proxy;

public class FirstEntity implements Entity {

    private String text;

    public FirstEntity(String text) {
        this.text = text;
        start();

    }

    public void start() {
        System.out.println("Starting program." + text + " | ");
    }

    @Override
    public void doSomething() {
        System.out.println("First Entity do something" + text + " | ");
    }
}

