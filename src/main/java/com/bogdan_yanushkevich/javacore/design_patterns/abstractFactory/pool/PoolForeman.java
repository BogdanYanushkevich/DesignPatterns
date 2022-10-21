package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.pool;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Foreman;

public class PoolForeman implements Foreman {
    @Override
    public void readProject() {
        System.out.println("Pool foreman reads project");
    }
}
