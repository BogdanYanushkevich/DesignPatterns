package main.java.com.bogdan_yanushkevich.javacore.design_patterns.memento;

import java.util.Date;

public class Save {

    private String name;
    private Date date;

    public Save(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
