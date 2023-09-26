package example5;

public class Generics5 {
    public static void main(String[] args) {
        Basket<Fruit> fruits = new Basket<>();
        Basket<Apple> apples = new Basket<>();
        Basket<Orange> oranges = new Basket<>();

//        Basket<String> strigns = new Basket<>();

        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Orange orange = new Orange();

        fruits.add(fruit);
        fruits.add(apple);
        fruits.add(orange);

        apples.add(apple);
//        apples.add(orange);

        oranges.add(orange);
//        oranges.add(apple);
//        oranges.add(fruit);

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        System.out.println();
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i));
        }
        System.out.println();
        for (int i = 0; i < oranges.size(); i++) {
            System.out.println(oranges.get(i));
        }
    }
}
