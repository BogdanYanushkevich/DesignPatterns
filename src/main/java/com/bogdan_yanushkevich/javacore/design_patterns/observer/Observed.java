package main.java.com.bogdan_yanushkevich.javacore.design_patterns.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
