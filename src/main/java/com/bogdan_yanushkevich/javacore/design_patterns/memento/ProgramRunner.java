package main.java.com.bogdan_yanushkevich.javacore.design_patterns.memento;

public class ProgramRunner {
    public static void main(String[] args) {

        Entity entity = new Entity();
        Repo repo = new Repo();


        System.out.println("Create entity.");
        entity.setNameAndDate("First entity.");

        System.out.println(entity);

        System.out.println("Saving entity.");
        repo.setSave(entity.save());

        System.out.println("Change entity");

        entity.setNameAndDate("Changed first entity");

        System.out.println(entity);

        System.out.println("Rollback changes.");
        entity.load(repo.getSave());

        System.out.println(entity);
    }
}
