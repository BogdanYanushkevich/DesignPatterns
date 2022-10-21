package main.java.com.bogdan_yanushkevich.javacore.interpeter;

public class TerminalText implements Text {
    private String sv;

    public TerminalText(String stringValue) {
        this.sv = stringValue;
    }

    @Override
    public boolean interpret(String someText) {
        if (someText.contains(sv)) {
            return true;
        }
        return false;
    }
}
