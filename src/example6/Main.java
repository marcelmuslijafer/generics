package example6;

import example1.MyGeneric;
import example5.Fruit;
import example5.Orange;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Orange> orangeGen = new MyGeneric<>(new Orange());
        MyGeneric<Object> objectGen = new MyGeneric<>("Abc");
        MyGeneric<String> strGen = new MyGeneric<>("Ante");

        MyGenericUtils.print(orangeGen, objectGen);

    }
}
