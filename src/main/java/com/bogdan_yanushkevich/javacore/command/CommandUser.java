package main.java.com.bogdan_yanushkevich.javacore.command;

public class CommandUser {
    CreateCommand createCommand;
    ReadCommand readCommand;
    UpdateCommand updateCommand;
    DeleteCommand deleteCommand;


    public CommandUser(CreateCommand createCommand, ReadCommand readCommand, UpdateCommand updateCommand, DeleteCommand deleteCommand) {
        this.createCommand = createCommand;
        this.readCommand = readCommand;
        this.updateCommand = updateCommand;
        this.deleteCommand = deleteCommand;
    }

    void runCreateCommand() {
        createCommand.execute();
    }

    void runReadCommand() {
        readCommand.execute();
    }

    void runUpdateCommand() {
        updateCommand.execute();
    }

    void runDeleteCommand() {
        deleteCommand.execute();
    }
}
