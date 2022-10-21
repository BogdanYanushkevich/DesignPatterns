package main.java.com.bogdan_yanushkevich.javacore.design_patterns.templateMethod;

public class ProgramRunner {
    public static void main(String[] args) {

        Template mainPage = new MainPage();
        Template newsPage = new NewsPage();


        mainPage.showPage();

        System.out.println("------------------");

        newsPage.showPage();
    }
}
