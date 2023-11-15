import java.util.TreeSet;

public class CollectionEx34 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("ccc");
        ts.add("sss");
        ts.add("aaa");
        ts.add("xxx");

        System.out.println(ts);

        TreeSet ts1 = new TreeSet();
        ts1.add(10);
        ts1.add("shramik"); // java.lang.ClassCastException
        ts1.add(null); // java.lang.NullPointerException

    }
}
