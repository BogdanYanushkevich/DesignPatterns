package main.java.com.bogdan_yanushkevich.javacore.design_patterns.chainOfResponsibility;

public class FirstEntity extends Entity {

    public FirstEntity(int priority) {
        super(priority);
    }

    @Override
    public void send(String text) {
        System.out.println("Some text from first Entity" + text);

    }
}
