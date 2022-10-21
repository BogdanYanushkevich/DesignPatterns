package main.java.com.bogdan_yanushkevich.javacore.design_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {

    public static void main(String[] args) {

        EntityFactory entityFactory = new EntityFactory();
        List<Entity> entities = new ArrayList<>();

        entities.add(entityFactory.getEntityByWord("first"));
        entities.add(entityFactory.getEntityByWord("first"));
        entities.add(entityFactory.getEntityByWord("first"));
        entities.add(entityFactory.getEntityByWord("first"));
        entities.add(entityFactory.getEntityByWord("first"));
        entities.add(entityFactory.getEntityByWord("second"));
        entities.add(entityFactory.getEntityByWord("second"));
        entities.add(entityFactory.getEntityByWord("second"));
        entities.add(entityFactory.getEntityByWord("second"));
        entities.add(entityFactory.getEntityByWord("second"));

        for (Entity e: entities) {
            e.doSomething();
        }
    }
}
