package main.java.com.bogdan_yanushkevich.javacore.design_patterns.prototype;

public class InstanceFactory {

    Instance instance;

    public InstanceFactory(Instance instance) {
        this.instance = instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    Instance copyInstance() {
        return (Instance) instance.copy();
    }
}
