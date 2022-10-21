package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public class SecondEntity extends EntityBuilder {
    @Override
    void buildName() {
        entity.setName("Second");
    }

    @Override
    void buildNumber() {
        entity.setNumber(2);
    }
}
