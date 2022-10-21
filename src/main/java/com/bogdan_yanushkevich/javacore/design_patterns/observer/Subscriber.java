package main.java.com.bogdan_yanushkevich.javacore.design_patterns.observer;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> ads) {
        System.out.println("Dear " + name + "\nWe have some changes in ads." + ads);
    }
}
