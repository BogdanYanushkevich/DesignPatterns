package main.java.com.bogdan_yanushkevich.javacore.design_patterns.prototype;

public class Instance implements Copyable {
    private int num;
    private String name;

    public Instance(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object copy() {
        Instance copy = new Instance(num, name);
        return copy;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
