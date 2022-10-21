package main.java.com.bogdan_yanushkevich.javacore.design_patterns.observer;

public class Search {
    public static void main(String[] args) {
        AdvertisingSite advertisingSite = new AdvertisingSite();

        advertisingSite.addAds("First ad");
        advertisingSite.addAds("Second ad");

        Observer firtsSubsriber = new Subscriber("Bogdan");
        Observer secondSubsriber = new Subscriber("Iryna");

        advertisingSite.addObserver(firtsSubsriber);
        advertisingSite.addObserver(secondSubsriber);

        advertisingSite.addAds("Third ad");

        advertisingSite.removeAds("First ad");
    }
}
