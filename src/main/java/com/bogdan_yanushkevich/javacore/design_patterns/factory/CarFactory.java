package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class CarFactory implements TransportFactory {
    @Override
    public Transport createTranspotr() {
        return new Car();
    }
}
