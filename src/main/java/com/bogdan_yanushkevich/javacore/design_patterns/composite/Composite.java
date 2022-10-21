package main.java.com.bogdan_yanushkevich.javacore.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    List<Entity> entities = new ArrayList<>();

    void addEntity(Entity entity) {
        entities.add(entity);
    }

    void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    void composeEntity() {
        System.out.println("Composite are compose entity.");
        for (Entity e : entities) {
            e.doingSomething();
        }
    }
}
