package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class Project implements Element {
    Element[] elements;

    public Project() {
        this.elements = new Element[]{
                new Drawing(),
                new Calculations(),
                new Layout()
        };
    }

    @Override
    public void beDone(Employee employee) {
        for (Element el : elements) {
            el.beDone(employee);
        }
    }
}
