package main.java.com.bogdan_yanushkevich.javacore.design_patterns.proxy;

public class ProxyFirstEntity implements Entity {
    private String text;
    private FirstEntity firstEntity;

    public ProxyFirstEntity(String text) {
        this.text = text;
    }

    @Override
    public void doSomething() {
        if (firstEntity == null) {
            firstEntity = new FirstEntity(text);
        }
        firstEntity.doSomething();
    }
}
