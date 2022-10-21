package main.java.com.bogdan_yanushkevich.javacore.design_patterns.chainOfResponsibility;

public class ThirdEntity extends Entity{
    public ThirdEntity(int priority) {
        super(priority);
    }

    @Override
    public void send(String text) {
        System.out.println("Some text from third Entity" + text);
    }
}
