package main.java.com.bogdan_yanushkevich.javacore.design_patterns.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        Singleton.addText("First string");
        Singleton.addText("Second string");
        Singleton.addText("Third string");

        Singleton.getInstance().getText();
    }
}
