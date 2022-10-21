package main.java.com.bogdan_yanushkevich.javacore.design_patterns.interpeter;

public class ProgramRunner {
    public static void main(String[] args) {
        Text someText = getSomeText();
        Text someElseText = getSomeElseText();

        System.out.println("Some text: " + someText.interpret("Some text"));
        System.out.println("New some else text: " + someElseText.interpret("Some text newSomeElseText"));
    }

    public static Text getSomeText() {
        Text someText = new TerminalText("Some text");
        Text newSomeText = new TerminalText("newSomeText");

        return new OrText(someText, newSomeText);
    }

    public static Text getSomeElseText() {
        Text someText = new TerminalText("Some text");
        Text newSomeElseTexts = new TerminalText("newSomeElseText");

        return new AndText(someText, newSomeElseTexts);
    }
}
