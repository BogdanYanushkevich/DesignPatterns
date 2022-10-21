package main.java.com.bogdan_yanushkevich.javacore.command;

public class DeleteCommand implements Command {
    CRUD crud;

    public DeleteCommand(CRUD crud) {
        this.crud = crud;
    }

    @Override
    public void execute() {
        crud.delete();
    }
}
