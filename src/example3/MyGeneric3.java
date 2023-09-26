package example3;

public class MyGeneric3<T> {
    private T value;

    public MyGeneric3(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public <E> void printArrayAtIndex(E[] array, int index) {
        System.out.println(array[index]);
    }

    public <E, F> void printMultipleArrays(E[] array1, F[] array2) {
        for (E element : array1) {
            System.out.printf("%s ", element);
        }
        System.out.println();

        for (F element : array2) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
