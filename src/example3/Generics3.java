package example3;


public class Generics3 {
    public static void main(String[] args) {
        MyGeneric3<String> myGenString = new MyGeneric3<>("Lara");
        MyGeneric3<Integer> myGenInt = new MyGeneric3<>(15);

        Integer[] arrInt = new Integer[]{1, 2, 3};
        String[] arrStr = new String[]{"This ", "is ", "a ", "sentence."};

        myGenString.printArray(arrInt);
        myGenString.printArray(arrStr);

        myGenInt.printArray(arrInt);
        myGenInt.printArray(arrStr);

        myGenString.printMultipleArrays(arrInt, arrStr);
    }
}
