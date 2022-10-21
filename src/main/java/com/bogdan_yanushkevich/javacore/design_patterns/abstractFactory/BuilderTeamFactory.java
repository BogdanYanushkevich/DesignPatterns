package main.java.com.bogdan_yanushkevich.javacore.design_patterns.abstractFactory;

public interface BuilderTeamFactory {
    Builder getBuilder();

    Foreman getForeman();

    CraneOperator getCraneOperator();
}
