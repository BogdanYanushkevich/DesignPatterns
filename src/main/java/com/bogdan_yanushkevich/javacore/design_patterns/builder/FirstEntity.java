package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public class FirstEntity extends EntityBuilder{
    @Override
    void buildName() {
        entity.setName("First");
    }

    @Override
    void buildNumber() {
        entity.setNumber(1);
    }
}
