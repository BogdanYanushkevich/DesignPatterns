package main.java.com.bogdan_yanushkevich.javacore.design_patterns.iterator;

public class Entity implements Collection {
    private String name;
    private String[] arr;

    public Entity(String name, String[] arr) {
        this.name = name;
        this.arr = arr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator getIterator() {
        return new EntityIterator();
    }

    private class EntityIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < arr.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return arr[index++];
        }
    }
}
