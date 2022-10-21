package main.java.com.bogdan_yanushkevich.javacore.design_patterns.decorator;

public class DecoratorSecondChild extends Decorator {
    public DecoratorSecondChild(Entity entity) {
        super(entity);
    }

    public String doingSomethingElse() {
        return "Decorator Second Child doing Something Else.";
    }

    public String doingSomething() {
        return super.doingSomething() + doingSomethingElse();
    }
}
