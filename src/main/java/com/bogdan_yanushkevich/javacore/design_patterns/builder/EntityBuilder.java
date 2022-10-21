package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public abstract class EntityBuilder {
    Entity entity;

    void createEntity() {
        entity = new Entity();
    }

    abstract void buildName();

    abstract void buildNumber();

    public Entity getEntity() {
        return entity;
    }
}
