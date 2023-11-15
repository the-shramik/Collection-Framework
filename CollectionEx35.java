import java.util.Comparator;
import java.util.TreeSet;

class MyComp1 implements Comparator<String> {

    public int compare(String s1, String s2) {

        return s2.compareTo(s1);
    }

}

class MyComp2 implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {

        return i2.compareTo(i1);
    }

}

public class CollectionEx35 {
    public static void main(String[] args) {

        TreeSet<String> ts1 = new TreeSet<String>(new MyComp1());

        ts1.add("fff");
        ts1.add("www");
        ts1.add("ooo");
        ts1.add("lll");

        System.out.println(ts1);

        TreeSet<Integer> ts2 = new TreeSet<Integer>(new MyComp2());
        ts2.add(55);
        ts2.add(22);
        ts2.add(99);
        ts2.add(11);

        System.out.println(ts2);

    }
}
