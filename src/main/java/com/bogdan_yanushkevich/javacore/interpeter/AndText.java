package main.java.com.bogdan_yanushkevich.javacore.interpeter;

public class AndText implements Text {

    Text text1;
    Text text2;

    public AndText(Text text1, Text text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public boolean interpret(String someText) {
        return text1.interpret(someText) && text2.interpret(someText);
    }
}
