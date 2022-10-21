package main.java.com.bogdan_yanushkevich.javacore.design_patterns.memento;

public class Repo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
