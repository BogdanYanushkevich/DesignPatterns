package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.pool;

import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Builder;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.BuilderTeamFactory;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.CraneOperator;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.Foreman;
import main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory.barn.Bricklayer;

public class PoolBuilderTeamFactory implements BuilderTeamFactory {
    @Override
    public Builder getBuilder() {
        return new Bricklayer();
    }

    @Override
    public Foreman getForeman() {
        return new PoolForeman();
    }

    @Override
    public CraneOperator getCraneOperator() {
        return new TowerCraneOperator();
    }
}
