package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Builder;

public class Bricklayer implements Builder {
    @Override
    public void build() {
        System.out.println("Bricklayer lays bricks.");
    }
}
