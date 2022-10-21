package main.java.com.bogdan_yanushkevich.javacore.design_patterns.mediator;

public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendText(String text) {
        chat.sendText(text, this);
    }

    @Override
    public void getText(String text) {
        System.out.println(this.name + "receive a message" + text + ".");
    }
}
