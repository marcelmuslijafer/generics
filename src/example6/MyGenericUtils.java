package example6;

import example1.MyGeneric;
import example5.Apple;
import example5.Fruit;
import example5.Orange;

public class MyGenericUtils {
    // Dodaj primjer za super
    public static void print(MyGeneric<? extends Fruit> g1, MyGeneric<? super Fruit> g2) {
        //? extends -> Open for reading, closed for writing

        Fruit fruit1 = g1.getValue();
//        g1.setValue(new Fruit());
//        g1.setValue(new Apple());
//        g1.setValue(new Orange());

        //? super -> Closed for reading, open for writing
        // Fruit fruit2 = g2.getValue();
        g2.setValue(new Apple());

        System.out.println(g1.getValue());
        System.out.println(g2.getValue());
    }

}
