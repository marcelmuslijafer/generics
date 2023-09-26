package example5;

import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private List<T> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public T get(int index) {
        return fruits.get(index);
    }

    public int size() {
        return fruits.size();
    }
}
