package main.java.com.bogdan_yanushkevich.javacore.design_patterns.command;

public class CreateCommand implements Command{
    CRUD crud;

    public CreateCommand(CRUD crud) {
        this.crud = crud;
    }

    @Override
    public void execute() {
        crud.create();
    }
}
