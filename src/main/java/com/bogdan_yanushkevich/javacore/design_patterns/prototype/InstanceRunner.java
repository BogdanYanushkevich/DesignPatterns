package main.java.com.bogdan_yanushkevich.javacore.design_patterns.prototype;

public class InstanceRunner {
    public static void main(String[] args) {
        Instance instance = new Instance(1, "first");

        System.out.println(instance);

        InstanceFactory instanceFactory = new InstanceFactory(instance);
        Instance clone = instanceFactory.copyInstance();

        System.out.println(clone);
    }
}
