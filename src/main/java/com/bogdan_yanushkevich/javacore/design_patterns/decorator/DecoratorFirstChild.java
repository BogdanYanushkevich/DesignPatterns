package main.java.com.bogdan_yanushkevich.javacore.design_patterns.decorator;

public class DecoratorFirstChild extends Decorator {
    public DecoratorFirstChild(Entity entity) {
        super(entity);
    }

    public String doingSomethingElse() {
        return "Decorator First Child doing Something Else.";
    }

    public String doingSomething() {
        return super.doingSomething() + doingSomethingElse();
    }
}
