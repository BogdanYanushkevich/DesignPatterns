package main.java.com.bogdan_yanushkevich.javacore.design_patterns.decorator;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge.SecondEntity;

public class ProgramRunner {
    public static void main(String[] args) {
        Entity entity = new DecoratorSecondChild(new DecoratorFirstChild(new FirstEntity()));


        System.out.println(entity.doingSomething());
    }
}
