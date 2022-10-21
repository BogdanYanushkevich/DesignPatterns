package main.java.com.bogdan_yanushkevich.javacore.design_patterns.srategy;

public class Bathyscaphe {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void start() {
        state.start();
    }
}
