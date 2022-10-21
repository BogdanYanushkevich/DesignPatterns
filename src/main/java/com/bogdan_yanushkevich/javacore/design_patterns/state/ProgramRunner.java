package main.java.com.bogdan_yanushkevich.javacore.design_patterns.state;

public class ProgramRunner {
    public static void main(String[] args) {
        State state = new Replenish();
        Bathyscaphe bathyscaphe = new Bathyscaphe();

        bathyscaphe.setState(state);

        for (int i = 0; i < 10; i++) {
            bathyscaphe.start();
            bathyscaphe.changeState();
        }
    }
}
