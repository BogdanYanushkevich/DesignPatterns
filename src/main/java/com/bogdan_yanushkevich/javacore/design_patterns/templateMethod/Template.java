package main.java.com.bogdan_yanushkevich.javacore.design_patterns.templateMethod;

public abstract class Template {

    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
