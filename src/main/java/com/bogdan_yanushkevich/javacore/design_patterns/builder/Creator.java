package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public class Creator {
    EntityBuilder builder;

    public void setEntityBuilder(EntityBuilder builder) {
        this.builder = builder;
    }

    Entity buildEntity() {
        builder.createEntity();
        builder.buildName();
        builder.buildNumber();

        return builder.getEntity();
    }
}
