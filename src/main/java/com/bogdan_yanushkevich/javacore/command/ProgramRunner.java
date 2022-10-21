package main.java.com.bogdan_yanushkevich.javacore.command;

public class ProgramRunner {
    public static void main(String[] args) {

        CRUD crud = new CRUD();

        CommandUser commandUser = new CommandUser(
                new CreateCommand(crud),
                new ReadCommand(crud),
                new UpdateCommand(crud),
                new DeleteCommand(crud)
        );

        commandUser.runCreateCommand();
        commandUser.runReadCommand();
        commandUser.runUpdateCommand();
        commandUser.runDeleteCommand();
    }


}
