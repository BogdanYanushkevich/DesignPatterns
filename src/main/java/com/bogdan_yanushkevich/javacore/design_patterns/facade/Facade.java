package main.java.com.bogdan_yanushkevich.javacore.design_patterns.facade;

public class Facade {

    Entity entity = new Entity();
    Task task = new Task();
    Switch aSwitch = new Switch();

    public void doSomething() {
        task.doingTask();
        aSwitch.start();
        entity.doSomethingWhenActive(aSwitch);
    }
}
