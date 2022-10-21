package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class BusFactory implements TransportFactory {
    @Override
    public Transport createTranspotr() {
        return new Bus();
    }
}
