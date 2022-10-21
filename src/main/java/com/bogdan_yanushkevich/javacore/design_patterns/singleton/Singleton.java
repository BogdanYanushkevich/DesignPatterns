package main.java.com.bogdan_yanushkevich.javacore.design_patterns.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private static String textString = "This is Sparta. \n\n";

    Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }

    public void getText() {
        System.out.println(textString);
    }

    public static void addText(String loginfo) {
        textString += loginfo + "\n";
    }

}
