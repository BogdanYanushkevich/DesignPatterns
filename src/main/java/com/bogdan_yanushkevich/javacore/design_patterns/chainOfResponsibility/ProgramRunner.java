package main.java.com.bogdan_yanushkevich.javacore.design_patterns.chainOfResponsibility;

public class ProgramRunner {
    public static void main(String[] args) {

        Entity firstEntity = new FirstEntity(Priority.LOW);
        Entity secondEntity = new SecondEntity(Priority.MED);
        Entity thirdEntity = new ThirdEntity(Priority.HIGH);


        firstEntity.setNextEntity(secondEntity);
        secondEntity.setNextEntity(thirdEntity);

        firstEntity.entityManager(" Some text from main 1", Priority.LOW);
        firstEntity.entityManager(" Some text from main 2 ", Priority.MED);
        firstEntity.entityManager(" Some text from main 3", Priority.HIGH);


    }
}
