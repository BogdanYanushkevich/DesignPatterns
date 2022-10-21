package main.java.com.bogdan_yanushkevich.javacore.design_patterns.adapter;

public class CRUDRunner {
    public static void main(String[] args) {
        CRUD crud = new AppAdapter();

        crud.create();
        crud.read();
        crud.update();
        crud.delete();

    }
}
