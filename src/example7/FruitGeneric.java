package example7;

import example1.MyGeneric;
import example5.Fruit;

public class FruitGeneric<T extends Fruit> extends MyGeneric<T> {

    public FruitGeneric(T value) {
        super(value);
    }
}
