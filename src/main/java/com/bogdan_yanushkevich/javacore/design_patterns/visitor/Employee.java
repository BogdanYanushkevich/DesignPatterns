package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public interface Employee {

    public void make(Drawing drawing);

    public void make(Calculations calculations);

    public void make(Layout layout);

}
