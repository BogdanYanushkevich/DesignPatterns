package main.java.com.bogdan_yanushkevich.javacore.design_patterns.state;

public class Bathyscaphe {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Replenish) {
            setState(new Dive());
        } else if (state instanceof Dive) {
            setState(new Explore());
        } else if (state instanceof Explore) {
            setState(new Float());
        } else if (state instanceof Float) {
            setState(new Replenish());
        }
    }

    public void start() {
        state.start();
    }
}
