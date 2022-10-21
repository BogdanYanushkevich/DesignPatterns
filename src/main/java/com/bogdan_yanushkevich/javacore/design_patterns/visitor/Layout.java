package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class Layout implements Element {
    @Override
    public void beDone(Employee employee) {
        employee.make(this);
    }
}
