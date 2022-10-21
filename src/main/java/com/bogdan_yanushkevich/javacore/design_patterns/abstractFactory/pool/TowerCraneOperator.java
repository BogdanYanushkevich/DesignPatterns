package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.pool;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.CraneOperator;

public class TowerCraneOperator implements CraneOperator {
    @Override
    public void controlsCrane() {
        System.out.println("Tower crane operator controls crane.");
    }
}
