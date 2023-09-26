package example2;

public class MyRegularClass {

    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
