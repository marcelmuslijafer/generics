package example2;

public class Generics2 {
    public static void main(String[] args) {
        MyRegularClass mrc = new MyRegularClass();
        String[] arrStr = new String[]{"This", "is", "a", "sentence."};
        Integer[] arrInt = new Integer[]{1, 2, 3};

        mrc.printArray(arrStr);
        mrc.printArray(arrInt);

//        MyRegularClass.printArray(arrStr);
//        MyRegularClass.printArray(arrInt);
    }
}
