package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

public abstract class Bridge {


    protected SomeEntity someEntity;

    public Bridge(SomeEntity someEntity) {
        this.someEntity = someEntity;
    }

    abstract void doingSomething();
}
