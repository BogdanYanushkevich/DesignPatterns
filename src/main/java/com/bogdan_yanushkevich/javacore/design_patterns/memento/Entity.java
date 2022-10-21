package main.java.com.bogdan_yanushkevich.javacore.design_patterns.memento;

import java.util.Date;

public class Entity {

    private String name;
    private Date date;

    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    public void load(Save save) {
        name = save.getName();
        date = save.getDate();

    }

    public Save save() {
        return new Save(name);
    }

    @Override
    public String toString() {
        return "Entity: /n" +
                "Name" + name + "\n" +
                "Date: " + date;
    }
}
