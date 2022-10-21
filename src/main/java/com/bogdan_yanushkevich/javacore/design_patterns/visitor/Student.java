package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class Student implements Employee {
    @Override
    public void make(Drawing drawing) {
        System.out.println("Draws a crooked drawing.");
    }

    @Override
    public void make(Calculations calculations) {
        System.out.println("Makes inaccurate calculations.");
    }

    @Override
    public void make(Layout layout) {
        System.out.println("Makes a clumsy layout.");
    }
}
