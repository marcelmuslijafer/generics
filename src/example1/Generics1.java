package example1;

public class Generics1 {
    public static void main(String[] args) {
        MyGeneric<String> genStr = new MyGeneric<>("kLara");
        MyGeneric<Integer> genInteger = new MyGeneric<>(15);

        String s1 = genStr.getValue();
        Integer i1 = genInteger.getValue();
    }
}
