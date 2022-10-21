package main.java.com.bogdan_yanushkevich.javacore.design_patterns.proxy;

public class ProgramRunner {
    public static void main(String[] args) {
        Entity entity = new ProxyFirstEntity(" with Value");

        entity.doSomething();

    }
}
