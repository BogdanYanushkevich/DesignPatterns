package main.java.com.bogdan_yanushkevich.javacore.design_patterns.srategy;

public class ProgramRunner {
    public static void main(String[] args) {

        Bathyscaphe bathyscaphe = new Bathyscaphe();

        bathyscaphe.setState(new Replenish());
        bathyscaphe.start();

        bathyscaphe.setState(new Dive());
        bathyscaphe.start();

        bathyscaphe.setState(new Explore());
        bathyscaphe.start();

        bathyscaphe.setState(new Float());
        bathyscaphe.start();

    }
}
