package main.java.com.bogdan_yanushkevich.javacore.design_patterns.mediator;

public class ProgramRunner {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User superUser = new SuperUser(chat, "SuperUser");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");


        chat.setSuperUSer(superUser);
        chat.addUsers(user1);
        chat.addUsers(user2);

        user1.sendText("First");
        user2.sendText("Second");
        superUser.sendText("Super");
    }
}
