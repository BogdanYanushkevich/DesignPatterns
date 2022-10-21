package main.java.com.bogdan_yanushkevich.javacore.design_patterns.chainOfResponsibility;

public class SecondEntity extends Entity{


    public SecondEntity(int priority) {
        super(priority);
    }

    @Override
    public void send(String text) {
        System.out.println("Some text from second Entity" + text);
    }
}
