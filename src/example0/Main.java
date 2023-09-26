package example0;

public class Main {
    public static void main(String[] args) {
        IntPair pairInt = new IntPair(1, 2);
        StringPair stringPair = new StringPair("Marcel", "kLara");

        Pair pair1 = new Pair(5, "kLara");
        Pair pair2 = new Pair(1, 2);

        Integer first = pairInt.getFirst();
        Integer second = pairInt.getSecond();

        String firstString = stringPair.getFirst();
        String secondString = stringPair.getSecond();

        System.out.println(first);
        System.out.println(second);
        System.out.println();
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println();
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        String s1 = (String) pair1.getFirst();
        String s2 = (String) pair1.getSecond();

        Integer i1 = (Integer) pair2.getFirst();
    }
}
