package main.java.com.bogdan_yanushkevich.javacore.design_patterns.factory;

public class ProgramRunner {
    public static void main(String[] args) {

        TransportFactory transportFactory = createTransportByName("bicycle");
        Transport transport = transportFactory.createTranspotr();

        transport.drive();


    }

    static TransportFactory createTransportByName(String name) {

        if (name.equalsIgnoreCase("bus")) {
            return new BusFactory();
        } else if (name.equalsIgnoreCase("bicycle")) {
            return new BicycleFactory();
        } else if (name.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else {
            throw new RuntimeException(name + "is unknown transport");
        }

    }
}