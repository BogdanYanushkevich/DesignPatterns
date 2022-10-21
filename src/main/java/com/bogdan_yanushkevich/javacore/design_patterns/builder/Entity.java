package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public class Entity {

    private String name;
    private int number;


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
