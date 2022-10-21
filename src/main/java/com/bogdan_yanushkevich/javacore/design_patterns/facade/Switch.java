package main.java.com.bogdan_yanushkevich.javacore.design_patterns.facade;

public class Switch {
    private boolean active;

    boolean isActive() {
        return active;
    }

    public void start() {
        System.out.println("Is active.");
        active = true;
    }

    public void end() {
        System.out.println("Is`nt active.");
        active = false;
    }
}
