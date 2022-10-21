package main.java.com.bogdan_yanushkevich.javacore.design_patterns.composite;

public class ProgramRunner {
    public static void main(String[] args) {
        Composite composite = new Composite();

        FirstEntity firstEntity = new FirstEntity();
        FirstEntity firstEntity1 = new FirstEntity();
        SecondEntity secondEntity = new SecondEntity();


        composite.addEntity(firstEntity);
        composite.addEntity(firstEntity1);
        composite.addEntity(secondEntity);


        composite.composeEntity();
    }



}
