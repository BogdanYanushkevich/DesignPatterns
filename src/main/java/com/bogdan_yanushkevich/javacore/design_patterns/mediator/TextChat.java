package main.java.com.bogdan_yanushkevich.javacore.design_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User superUSer;
    List<User> users = new ArrayList<>();

    public void setSuperUSer(User superUSer) {
        this.superUSer = superUSer;
    }

    public void addUsers(User user) {
        this.users.add(user);
    }

    @Override
    public void sendText(String text, User user) {
        for (User u : users) {
            if (u != user) {
                u.getText(text);
            }
        }
        superUSer.getText(text);
    }
}
