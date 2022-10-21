package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Foreman;

public class BarnForeman implements Foreman {

    @Override
    public void readProject() {
        System.out.println("Barn Foreman reads project.");
    }
}
