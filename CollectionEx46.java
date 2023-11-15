import java.util.Comparator;
import java.util.TreeMap;

public class CollectionEx46 {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyComp());
        tm.put(11, "aaa");
        tm.put(22, "bbb");
        tm.put(33, "ccc");
        tm.put(44, "ddd");

        System.out.println(tm);
    }
}

class MyComp implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
    }
}
