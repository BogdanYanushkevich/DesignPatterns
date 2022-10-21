package main.java.com.bogdan_yanushkevich.javacore.design_patterns.decorator;

public class Decorator implements Entity {

    Entity entity;

    public Decorator(Entity entity) {
        this.entity = entity;
    }

    public String doingSomething() {
        return entity.doingSomething();
    }
}