import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionEx45 {

    public static void main(String[] args) {

        TreeMap<Integer, Character> tm1 = new TreeMap<Integer, Character>();

        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            tm1.put(i, c);
            c++;
        }

        System.out.println(tm1);

        SortedMap<Integer, Character> sm1 = tm1.subMap(3, 20);
        TreeMap<Integer, Character> tm2 = new TreeMap<Integer, Character>(sm1);

        System.out.println(tm2);

        SortedMap<Integer, Character> sm2 = tm1.headMap(10);
        TreeMap<Integer, Character> tm3 = new TreeMap<Integer, Character>(sm2);
        System.out.println(tm3);

        SortedMap<Integer, Character> sm3 = tm1.tailMap(5);
        TreeMap<Integer, Character> tm4 = new TreeMap<Integer, Character>(sm3);
        System.out.println(tm4);
    }
}
