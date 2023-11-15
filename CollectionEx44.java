import java.util.TreeMap;

public class CollectionEx44 {
    public static void main(String[] args) {

        // constructor approach
        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
        tm1.put("guru", 111);
        tm1.put("albu", 222);

        TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>(tm1);
        tm2.put("siya", 333);
        tm2.put("alexa", 444);

        System.out.println(tm2);

        // putAll()

        TreeMap<Integer, String> tMap1 = new TreeMap<Integer, String>();
        tMap1.put(33, "aaa");
        tMap1.put(44, "bbb");

        TreeMap<Integer, String> tMap2 = new TreeMap<Integer, String>();
        tMap2.put(11, "ccc");
        tMap2.put(22, "ddd");

        TreeMap<Integer, String> tMap3 = new TreeMap<Integer, String>();
        tMap3.put(55, "eee");
        tMap3.put(66, "fff");

        tMap3.putAll(tMap1);
        tMap3.putAll(tMap2);
        System.out.println(tMap3);
    }
}
