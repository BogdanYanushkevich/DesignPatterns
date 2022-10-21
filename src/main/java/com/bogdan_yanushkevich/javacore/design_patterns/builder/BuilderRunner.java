package main.java.com.bogdan_yanushkevich.javacore.design_patterns.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setEntityBuilder(new SecondEntity());
        Entity entity = creator.buildEntity();

        System.out.println(entity);
    }
}
