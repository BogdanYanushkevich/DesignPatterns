package main.java.com.bogdan_yanushkevich.javacore.design_patterns.adapter;

public class AppAdapter extends SomeApp implements CRUD {


    @Override
    public void create() {
        save();
    }

    @Override
    public void read() {
        load();
    }

    @Override
    public void update() {
        upToDate();
    }

    @Override
    public void delete() {
        remove();
    }
}
