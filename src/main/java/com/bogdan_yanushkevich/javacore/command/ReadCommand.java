package main.java.com.bogdan_yanushkevich.javacore.command;

public class ReadCommand implements Command{
    CRUD crud;

    public ReadCommand(CRUD crud) {
        this.crud = crud;
    }

    @Override
    public void execute() {
        crud.read();
    }
}
