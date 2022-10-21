package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class Drawing implements Element {
    @Override
    public void beDone(Employee employee) {
        employee.make(this);
    }
}
