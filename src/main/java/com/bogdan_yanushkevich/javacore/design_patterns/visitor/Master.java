package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class Master implements Employee {
    @Override
    public void make(Drawing drawing) {
        System.out.println("Rewrites the drawing.");
    }

    @Override
    public void make(Calculations calculations) {
        System.out.println("Recalculates calculations.");
    }

    @Override
    public void make(Layout layout) {
        System.out.println("Reworks the layout.");
    }
}
