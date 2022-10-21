package main.java.com.bogdan_yanushkevich.javacore.design_patterns.chainOfResponsibility;

public abstract class Entity {
    private int priority;
    private Entity nextEntity;

    public Entity(int priority) {
        this.priority = priority;
    }

    public void setNextEntity(Entity entity) {
        this.nextEntity = entity;
    }

    public void entityManager(String text, int lvl) {
        if (lvl >= priority) {
            send(text);
        }
        if (nextEntity != null) {
            nextEntity.entityManager(text, lvl);
        }
    }

    public abstract void send(String text);
}
