package main.java.com.bogdan_yanushkevich.javacore.design_patterns.bridge;

import java.util.Arrays;

public class ProgrammRunner {
    public static void main(String[] args) {

        Bridge[] bridge = {
                new BridgeFirstChild(new FirstEntity()),
                new BridgeSecondChild(new SecondEntity())
        };


        for (Bridge br : bridge) {
            br.doingSomething();
        }

    }
}
