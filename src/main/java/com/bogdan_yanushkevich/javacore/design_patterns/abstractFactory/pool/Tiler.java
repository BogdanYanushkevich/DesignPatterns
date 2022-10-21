package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.pool;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Builder;

public class Tiler implements Builder {
    @Override
    public void build() {
        System.out.println("Tiler lays tails.");
    }
}
