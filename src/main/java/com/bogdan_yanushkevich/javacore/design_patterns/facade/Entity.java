package main.java.com.bogdan_yanushkevich.javacore.design_patterns.facade;

public class Entity {

    public void doSomethingWhenActive(Switch s) {
        if (s.isActive()) {
            System.out.println("Entity do something");
        } else {
            System.out.println("Entity doing nothing");
        }
    }
}
