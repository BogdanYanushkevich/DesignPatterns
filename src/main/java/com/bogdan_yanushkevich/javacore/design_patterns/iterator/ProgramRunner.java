package main.java.com.bogdan_yanushkevich.javacore.design_patterns.iterator;

public class ProgramRunner {
    public static void main(String[] args) {
        String[] arr = {"firts", "second", "third", "fours"};
        Entity entity = new Entity("one", arr);

        Iterator iterator = entity.getIterator();
        System.out.println("Entity: " + entity.getName());
        System.out.println("Arr: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
