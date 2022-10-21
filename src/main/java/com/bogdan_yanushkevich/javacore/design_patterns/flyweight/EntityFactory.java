package main.java.com.bogdan_yanushkevich.javacore.design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EntityFactory {

    private static final Map<String, Entity> entityMap = new HashMap<>();

    public Entity getEntityByWord(String word) {
        Entity entity = entityMap.get(word);

        if (entity == null) {
            switch (word) {
                case "first":
                    System.out.println("Create first entity.");
                    entity = new FirstEntity();
                    break;

                case "second":
                    System.out.println("Create second entity.");
                    entity = new SecondEntity();
            }
            entityMap.put(word, entity);
        }
        return entity;
    }
}

