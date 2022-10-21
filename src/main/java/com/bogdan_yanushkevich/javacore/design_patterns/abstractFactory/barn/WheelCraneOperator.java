package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.CraneOperator;

public class WheelCraneOperator implements CraneOperator {
    @Override
    public void controlsCrane() {
        System.out.println("Crane operator controls crane");
    }
}
