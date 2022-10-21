package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

public class BridgeFirstChild extends Bridge {


    public BridgeFirstChild(SomeEntity someEntity) {
        super(someEntity);
    }

    @Override
    void doingSomething() {
        System.out.println("BridgeFirstChild doing something");
        someEntity.doingSomething();
    }
}
