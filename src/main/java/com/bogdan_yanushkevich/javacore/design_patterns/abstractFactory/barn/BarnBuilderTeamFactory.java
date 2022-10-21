package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Builder;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.BuilderTeamFactory;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.CraneOperator;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Foreman;

public class BarnBuilderTeamFactory implements BuilderTeamFactory {
    @Override
    public Builder getBuilder() {
        return new Bricklayer();
    }

    @Override
    public Foreman getForeman() {
        return new BarnForeman();
    }

    @Override
    public CraneOperator getCraneOperator() {
        return new WheelCraneOperator();
    }
}
