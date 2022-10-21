package main.java.com.bogdan_yanushkevich.javacore.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingSite implements Observed {
    List<String> ads = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addAds(String ad) {
        this.ads.add(ad);
        notifyObservers();
    }

    public void removeAds(String ad) {
        this.ads.remove(ad);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : subscribers) {
            obs.handleEvent(this.ads);
        }
    }
}
