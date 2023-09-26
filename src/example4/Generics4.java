package example4;

public class Generics4 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Lara");
        Pair<Integer, Integer> pair2 = new Pair<>(3, 4);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());

        Integer x = pair1.getFirst();
    }
}
