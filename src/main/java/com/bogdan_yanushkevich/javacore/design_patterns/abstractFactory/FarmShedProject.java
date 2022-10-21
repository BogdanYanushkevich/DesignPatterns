package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn.BarnBuilderTeamFactory;

public class FarmShedProject {
    public static void main(String[] args) {
        BuilderTeamFactory builderTeamFactory = new BarnBuilderTeamFactory();
        Foreman foreman = builderTeamFactory.getForeman();
        Builder builder = builderTeamFactory.getBuilder();
        CraneOperator craneOperator = builderTeamFactory.getCraneOperator();

        System.out.println("Building a barn: ");
        foreman.readProject();
        builder.build();
        craneOperator.controlsCrane();
    }
}
