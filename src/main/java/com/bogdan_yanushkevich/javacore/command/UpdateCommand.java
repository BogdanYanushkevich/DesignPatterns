package main.java.com.bogdan_yanushkevich.javacore.command;

import java.util.concurrent.ConcurrentMap;

public class UpdateCommand implements Command {
    CRUD crud;

    public UpdateCommand(CRUD crud) {
        this.crud = crud;
    }

    @Override
    public void execute() {
        crud.update();
    }
}
