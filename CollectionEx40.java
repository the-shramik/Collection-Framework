import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionEx40 {

    public static void main(String[] args) {

        HashMap<Integer, String> h = new HashMap<Integer, String>();

        h.put(111, "guru");
        h.put(222, "albu");
        h.put(333, "siya");
        h.put(444, "sara");

        Set<Integer> s = h.keySet();
        System.out.println(s);

        Collection<String> c = h.values();
        System.out.println(c);

        Set<Entry<Integer, String>> se = h.entrySet();
        for (Entry<Integer, String> e : se) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
