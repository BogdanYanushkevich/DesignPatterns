package main.java.com.bogdan_yanushkevich.javacore.design_patterns.visitor;

public class ProgramRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Employee student = new Student();
        Employee master = new Master();

        System.out.println("Student in work.");
        project.beDone(student);

        System.out.println("\n");

        System.out.println("Master in work.");
        project.beDone(master);
    }
}
