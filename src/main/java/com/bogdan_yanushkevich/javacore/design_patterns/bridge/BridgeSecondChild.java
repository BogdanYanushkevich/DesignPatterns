package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

public class BridgeSecondChild extends Bridge {

    public BridgeSecondChild(SomeEntity someEntity) {
        super(someEntity);
    }

    @Override
    void doingSomething() {
        System.out.println("BridgeSecondChild doing something");
        someEntity.doingSomething();
    }
}
